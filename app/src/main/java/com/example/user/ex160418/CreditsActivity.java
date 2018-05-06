package com.example.user.ex160418;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {
    TextView answerr;
    Button ret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        answerr=(TextView)findViewById(R.id.textView);
        ret=(Button)findViewById(R.id.result);
    }

    public void returnb(View view) {
        Intent t=new Intent(this, MainActivity.class);
        startActivity(t);
    }
}
