package com.example.silvertown.view.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.example.silvertown.R;
import com.example.silvertown.view.BaseActivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends BaseActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        Log.d("main","start main");
        setContentView(R.layout.activity_main);

    }
}
