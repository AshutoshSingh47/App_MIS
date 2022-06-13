package com.example.data_op;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        TextView textView,textView1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.clock);
        textView1=(TextView)findViewById(R.id.status);

        findViewById(R.id.stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String format = "hh:mm:ss aa";
                SimpleDateFormat sdf =new SimpleDateFormat(format, Locale.US);
                String callstarttime = sdf.format(Calendar.getInstance().getTime());
                textView.setText(callstarttime);
                textView1.setText("STOP");
            }
        });
        findViewById(R.id.continuous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String format = "hh:mm:ss aa";
                SimpleDateFormat sdf =new SimpleDateFormat(format, Locale.US);
                String callstarttime = sdf.format(Calendar.getInstance().getTime());
                textView.setText(callstarttime);
                textView1.setText("CONTINUE");
            }
        });
        findViewById(R.id.finish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String format = "hh:mm:ss aa";
                SimpleDateFormat sdf =new SimpleDateFormat(format, Locale.US);
                String callstarttime = sdf.format(Calendar.getInstance().getTime());
                textView.setText(callstarttime);
                textView1.setText("FINISH");
            }
        });
    }
}
