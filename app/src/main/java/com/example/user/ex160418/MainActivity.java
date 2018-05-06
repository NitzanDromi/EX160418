package com.example.user.ex160418;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btpl,btmn, btk, bth, btdelete, btans, credt;
    EditText dis;
    double mishtane, mishtane2=0;
    int op, sum=0;
    String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btpl=(Button) findViewById(R.id.plus);
        btmn= (Button) findViewById(R.id.minus);
        btk=(Button) findViewById(R.id.kefel);
        bth=(Button) findViewById(R.id.hiluk);
        btdelete=(Button) findViewById(R.id.erase);
        btans=(Button) findViewById(R.id.result);
        dis=(EditText) findViewById(R.id.displayy);
    }


    public void hibur(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))){
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            mishtane = mishtane2 + mishtane;
            dis.setText("");
            dis.setHint(Double.toString(mishtane));
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 1;
    }


    public void hisur(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))){
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            mishtane = mishtane - mishtane2;
            dis.setText("");
            dis.setHint(Double.toString(mishtane));
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
            op=2;
    }

    public void kefel(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))){
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            mishtane = mishtane2 * mishtane;
            dis.setText("");
            dis.setHint(Double.toString(mishtane));
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
            op = 3;
    }

    public void hiluk(View view) {
        if ((!dis.getText().toString().equals(""))&&((!dis.getText().toString().equals("."))&&(!dis.getText().toString().equals("-"))&&(!dis.getText().toString().equals("-.")))){
            String dp = dis.getText().toString();
            mishtane2 = Double.parseDouble(dp);
            mishtane = mishtane / mishtane2;
            dis.setText("");
            dis.setHint(Double.toString(mishtane));
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 4;
    }

    public void clear(View view) {
        dis.setText("");
    }

    public void answer(View view) {
        String dp=dis.getText().toString();
        mishtane2=Double.parseDouble(dp);
        switch (op) {
            case 1:
                mishtane = mishtane + mishtane2; break;
            case 2:
                mishtane = mishtane - mishtane2; break;
            case 3:
                mishtane = mishtane * mishtane2; break;
            case 4:
                mishtane = mishtane / mishtane2; break;
            default: dis.setText("error");
        }
        str= Double.toString(mishtane);
        dis.setText(str);
    }
}
