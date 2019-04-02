package com.example.administrator.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView out;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = (TextView)findViewById(R.id.txtout);
        edit = (EditText)findViewById(R.id.inp);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("main","onClick msg....");
        String str = edit.getText().toString();
        float str1 = Float.parseFloat(str);
        float d = str1*9/5+32;
        String str2="the result";
        out.setText(str2+":"+d);
    }
}
