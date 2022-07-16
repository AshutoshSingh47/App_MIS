package com.example.data_op;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity
{
    String callstarttime,status;
    TextView textView,timetext;
    protected static int backbackexit=1;
    SharedPreferences sp;
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("time",callstarttime);
        outState.putString("status",status);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        callstarttime=savedInstanceState.getString("time");
        status=savedInstanceState.getString("status");
        textView=(TextView)findViewById(R.id.clock);
        timetext=(TextView)findViewById(R.id.status);
        textView.setText(callstarttime);
        timetext.setText(status);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        TextView textView,textView1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.clock);
        textView1=(TextView)findViewById(R.id.status);
        sp=getSharedPreferences("logged",MODE_PRIVATE);
        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String format = "hh:mm:ss aa";
                SimpleDateFormat sdf =new SimpleDateFormat(format, Locale.US);
                callstarttime = sdf.format(Calendar.getInstance().getTime());
                textView.setText(callstarttime);
                status="STOP";
                textView1.setText(status);

            }
        });
        findViewById(R.id.continuous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String format = "hh:mm:ss aa";
                SimpleDateFormat sdf =new SimpleDateFormat(format, Locale.US);
                callstarttime = sdf.format(Calendar.getInstance().getTime());
                textView.setText(callstarttime);
                status="CONTINUE";
                textView1.setText(status);
            }
        });
        findViewById(R.id.finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String format = "hh:mm:ss aa";
                SimpleDateFormat sdf =new SimpleDateFormat(format, Locale.US);
                callstarttime = sdf.format(Calendar.getInstance().getTime());
                textView.setText(callstarttime);
                status="FINISH";
                textView1.setText(status);
                sp.edit().putBoolean("logged",false).apply();

            }
        });

    }
    @Override
    public void onBackPressed()
    {
        if (backbackexit >= 1)
        {
            androidx.appcompat.app.AlertDialog.Builder alertDialog = new AlertDialog.Builder(
                    SecondActivity.this);
            alertDialog.setTitle(getResources().getString(R.string.app_name));
            alertDialog.setMessage("Are you sure you want to exit??");
            alertDialog.setPositiveButton("YES",
                    (dialog, which) -> ActivityCompat.finishAffinity(SecondActivity.this));
            alertDialog.setNeutralButton("NO",
                    (dialog, which) -> {
                    });
            alertDialog.show();
        }
        else
        {
            backbackexit++;
            Toast.makeText(getBaseContext(), "Press again to Exit", Toast.LENGTH_SHORT).show();
        }
    }
}
