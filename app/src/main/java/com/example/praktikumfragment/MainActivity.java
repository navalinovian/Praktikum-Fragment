package com.example.praktikumfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.praktikumfragment.activities.DynamicActivity;
import com.example.praktikumfragment.activities.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickStaticFragment(View view) {
        Intent intent = new Intent(this, StaticActivity.class);
        startActivity(intent);
    }

    public void handlerClickPraktikumFragment(View view) {


    }

    public void handlerClickDynamicFragment(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }
}
