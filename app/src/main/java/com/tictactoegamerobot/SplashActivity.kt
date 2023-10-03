package com.tictactoegamerobot

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.tictacgamerobot.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        Handler().postDelayed(object : kotlinx.coroutines.Runnable {

            override fun run() {

                startActivity(Intent(this@SplashActivity, AskQustionActivity::class.java))
                finish()
            }

        }, 4500)
    }
}