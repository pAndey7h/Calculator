package com.clueless.std;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity extends AppCompatActivity {
    private TextView no1,no2,result;
    private EditText edt1,edt2;
    private Button btn,bt,bt1,bt2,btn3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {                        // storing
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);    //to connect to xml file
        no1=(TextView)findViewById(R.id.Text_1);
        no2=(TextView)findViewById(R.id.Text_2);
        result=(TextView)findViewById(R.id.ans);
        edt1=(EditText)findViewById(R.id.Input_1);
        edt2=(EditText)findViewById(R.id.Input_2);
        btn=(Button)findViewById(R.id.Submit);
        bt=(Button)findViewById(R.id.sub);
        bt1=(Button)findViewById(R.id.mul);
        bt2=(Button)findViewById(R.id.div);
        btn3=(Button)findViewById(R.id.next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edt1.getText().toString());
                int b=Integer.parseInt(edt2.getText().toString());
                final int sum =a+b;
                result.setText("  "+sum);
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edt1.getText().toString());
                int b=Integer.parseInt(edt2.getText().toString());
                final int sum =a-b;
                result.setText("  "+sum);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edt1.getText().toString());
                int b=Integer.parseInt(edt2.getText().toString());
                final int sum =a*b;
                result.setText("  "+sum);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(edt1.getText().toString());
                int b=Integer.parseInt(edt2.getText().toString());
                final int sum =a/b;
                result.setText("  "+sum);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Activity.this,second.class);
                startActivity(i);
            }
        });
    }
}
