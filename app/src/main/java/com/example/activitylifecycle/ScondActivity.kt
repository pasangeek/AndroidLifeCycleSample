package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ScondActivity : AppCompatActivity() {
    private val TAG = ScondActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scond)



        val second2 = findViewById<Button>(R.id.second2first)
        second2.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }


        Log.d(TAG,"$TAG:on create")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"$TAG:on start")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"$TAG:onresume" )
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG,"$TAG:onPause" )
    }

    override fun onStop() {

        super.onStop()
        Log.d(TAG,"$TAG:onStop" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"$TAG:OnDestroy")
    }
}