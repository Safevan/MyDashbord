package com.example.mydashbordnape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        crdJiyoon.setOnClickListener {
            startActivity(Intent(this,Jiyoon::class.java))
        }
        crdRyujin.setOnClickListener {
            startActivity(Intent(this,Ryujin::class.java))
        }
        crdYeji.setOnClickListener {
            startActivity(Intent(this,Yeji::class.java))
        }
        crdLia.setOnClickListener {
            startActivity(Intent(this,Lia::class.java))
        }
        crdIrene.setOnClickListener {
            startActivity(Intent(this,Irene::class.java))
        }
        crdJihan.setOnClickListener {
            startActivity(Intent(this,Jihan::class.java))
        }
    }

}