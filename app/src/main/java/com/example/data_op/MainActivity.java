package com.example.data_op;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.annotations.Nullable;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button button;
    //EditText text,text2,text3;
    String[] language ={"as","bs","cs","ds","es","fs","gs","hs","is","js","ks","ls","ms","ns","os","ps","qs"};
    String a,b,c,d;

    /*@Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("id",a);
        outState.putString("part_name",b);
        outState.putString("machine",c);
        outState.putString("tool_in_charge",d);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        a=savedInstanceState.getString("id");
        b=savedInstanceState.getString("part_name");
        c=savedInstanceState.getString("machine");
        d=savedInstanceState.getString("tool_in_charge");
        super.onRestoreInstanceState(savedInstanceState);
    }
    This part has been commented for future use of orientation mode to restore activity items.*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        button=(Button)findViewById(R.id.start);

        /*findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            private String path_id;

            @Override
            public void onClick(View view) {

                text=(EditText)findViewById(R.id.Id);
                text2=(EditText)findViewById(R.id.Incharge);
                text3=(EditText)findViewById(R.id.Part_Name);
                String Id=text.getText().toString();
                this.path_id=Id;
                String Incharge=text2.getText().toString();
                String Part_Name=text3.getText().toString();
                data_holder obj=new data_holder(Incharge,Part_Name);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(Id);
//                myRef.setValue(obj);
            }
        });
        This part has been commented for future use of CRUD functionality in database.*/

            ArrayAdapter<String> adapter = new ArrayAdapter<String>
                    (this, android.R.layout.select_dialog_item, language);
            AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompletetextView1);
            actv.setThreshold(1);
            actv.setAdapter(adapter);
            actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    a = (String) adapter.getItem(i);
                }
            });
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>
                    (this, android.R.layout.select_dialog_item, language);
            AutoCompleteTextView actv2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
            actv2.setThreshold(1);
            actv2.setAdapter(adapter2);
            actv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    b = (String) adapter2.getItem(i);
                }
            });
            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>
                    (this, android.R.layout.select_dialog_item, language);
            AutoCompleteTextView actv3 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
            actv3.setThreshold(1);
            actv3.setAdapter(adapter3);
            actv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    c = (String) adapter3.getItem(i);
                }
            });
            ArrayAdapter<String> adapter4 = new ArrayAdapter<String>
                    (this, android.R.layout.select_dialog_item, language);
            AutoCompleteTextView actv4 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4);
            actv4.setThreshold(1);
            actv4.setAdapter(adapter4);
            actv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    d = (String) adapter4.getItem(i);
                }
            });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(a)||TextUtils.isEmpty(b)||TextUtils.isEmpty(c)||TextUtils.isEmpty(d))
                {
                    Toast.makeText(MainActivity.this, "INVALID", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                    startActivity(intent);
                    data_holder obj=new data_holder(b,c,d);
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference(a);
                    myRef.setValue(obj);
                }
            }
        });


    }
}
