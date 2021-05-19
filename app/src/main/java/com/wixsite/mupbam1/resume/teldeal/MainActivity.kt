package com.wixsite.mupbam1.resume.teldeal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.wixsite.mupbam1.resume.teldeal.databinding.ActivityMainBinding
import kotlin.concurrent.thread



class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    private var counter:Int = 0
    private var somestring:String =""
    private var message:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        Log.d("MyLog_MAct","onCreate")


    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog_MAct","onStart")
    }


    override fun onResume() {
               super.onResume()
        Log.d("MyLog_MAct","onResume")
        message = findViewById(R.id.message)
        message?.setText(somestring.toString())
        counter++
        if (counter == 3) {
            somestring = "это - уже в третий раз!!!"

        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog_MAct","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog_MAct","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog_MAct","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog_MAct","onDestroy")
    }
    fun onClickButton(view:View){
        bindingClass.message.text="Hi!"


    }

    }




