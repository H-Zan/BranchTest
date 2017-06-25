package com.example.huzan.branchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person tutu = new Person();
        tutu.age = 20;
        Person jake = new Person();
        jake.age = 18;
    }
}
