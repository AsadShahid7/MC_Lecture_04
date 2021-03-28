package com.example.mc_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("onCreate: ","This is on create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart: ","This is on Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume: ","This is on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause: ","This is on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy: ","This is on destroy");
    }

    public void goToDial(View view) {
        Uri uri= Uri.parse("tel: +92333403333");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
}

    public void goToWeb(View view) {
        Uri uri= Uri.parse("https://www.pucit.edu.pk");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void goToCounter(View view) {
        startActivity(new Intent(MainActivity2.this,CounterMaintainState.class));
    }
}