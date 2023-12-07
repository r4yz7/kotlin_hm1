package com.example.hm1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var startTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startTime = System.currentTimeMillis()
    }

    fun buttonClickHello(view : View){
        Log.d("Lifecycle","Button press");
        findViewById<TextView>(R.id.textView).text = "Button press";
    }
    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "onStop()")
        val stopTime = System.currentTimeMillis()
        val difference = stopTime - startTime
        Log.d("Lifecycle", "onCreate and onStop: ${difference} ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "onDestroy()")
    }

    fun buttonClickAbout(view: View){
        val intent = Intent(this, AboutActivity::class.java);
        startActivity(intent);
    }
}