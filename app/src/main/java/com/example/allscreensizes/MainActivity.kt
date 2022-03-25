package com.example.allscreensizes

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.setLogo(R.drawable.bar);
        supportActionBar?.setDisplayUseLogoEnabled(true);
        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(
            Color.parseColor("#FF3700B3")
        )
        );
    }
}