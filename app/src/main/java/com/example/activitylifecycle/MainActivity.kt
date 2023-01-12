package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val second = findViewById<Button>(R.id.second)
        second.setOnClickListener {

       val intent = Intent(this,SecondActivity::class.java)
      startActivity(intent)
            intent.putExtra("Uni_name","SLIIT")
            intent.putExtra("Extra_PHONE_number","010004551")
            startActivity(intent)

           intent.action = intent.action
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