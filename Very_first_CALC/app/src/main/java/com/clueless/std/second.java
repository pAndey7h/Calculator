package com.clueless.std;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {
private Button bt,bt1;
private TextView text1,text2,ans;
private EditText d1,d2,m1,m2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text1=(TextView)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        d1=(EditText)findViewById(R.id.bd);
        m1=(EditText)findViewById(R.id.bm);
        y1=(EditText)findViewById(R.id.by);
        d2=(EditText)findViewById(R.id.cd);
        m2=(EditText)findViewById(R.id.cm);
        y2=(EditText)findViewById(R.id.cy);
        bt1=(Button)findViewById(R.id.back);
        bt=(Button)findViewById(R.id.submit) ;

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int bd=Integer.parseInt(d1.getText().toString());
                int cd=Integer.parseInt(d2.getText().toString());
                int bm=Integer.parseInt(m2.getText().toString());
                int cm=Integer.parseInt(m1.getText().toString());
                int by=Integer.parseInt(y2.getText().toString());
                int cy=Integer.parseInt(d1.getText().toString());
                final int d,m,y;
                if(bd>cd)
                {
                    cd+=30;
                    cm--;
                }
                else
                    cd++;
                d=(cd-bd);
                if(cm<bm)
                {
                    cm+=12;
                    cy--;
                }
                else
                    cm++;
                m=(cm-bm);
                y=(cy-by);
                ans.setText("    "+y);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(second.this,Activity.class);
                startActivity(i);
            }
        });
    }
}
