package com.example.splash_bar_kt

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // on below line we are configuring our window to full screen
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Handler().postDelayed(
            { // on below line we are
                // creating a new intent
                val i = Intent(this@SplashActivity, MainActivity::class.java)

                // on below line we are
                // starting a new activity.
                startActivity(i)

                // on the below line we are finishing
                // our current activity.
                finish()
            },3000)
    }
}