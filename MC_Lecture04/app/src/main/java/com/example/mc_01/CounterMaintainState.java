package com.example.mc_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class CounterMaintainState extends AppCompatActivity {

    int val=0;
    String num;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_maintain_state);
        textView=findViewById(R.id.textView3);
        num=String.valueOf(val);
        textView.setText(num);
        if(savedInstanceState!=null)
        {
            val=savedInstanceState.getInt("MyCount");
            num=String.valueOf(val);
            textView.setText(num);
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("MyCount",val);
    }

    public void addOneNumber(View view) {
        val++;
        num=String.valueOf(val);
        textView.setText(num);
    }
}