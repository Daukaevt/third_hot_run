package com.wixsite.mupbam1.resume.teldeal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.concurrent.thread



class MainActivity : AppCompatActivity() {

    private var counter:Int = 0
    private var somestring:String =""
    private var message:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    override fun onResume() {
               super.onResume()
        message = findViewById(R.id.message)
        message?.setText(somestring.toString())
        counter++
        if (counter == 3) {
            somestring = "это - уже в третий раз!!!"

        }
    }

    }




