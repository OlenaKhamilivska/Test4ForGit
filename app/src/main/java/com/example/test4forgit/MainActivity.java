package com.example.test4forgit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //comment Created Olena2 Branch
    //comment created Olena3 branch

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static void saveTest() {
        Log.d("4TAG", "saveTest: jhgf");
    }
}