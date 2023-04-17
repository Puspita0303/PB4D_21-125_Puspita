package com.example.intentkotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

private lateinit var btnst : Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnst = findViewById(R.id.btnsatu)
        btnst.setOnClickListener(this)

        val btnd: Button = findViewById(R.id.btndua)
        btnd.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btndua -> {
                val phoneNumber= "085334891113"
                val dialNumber= Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialNumber)
            }

            R.id.btnsatu -> run {
                val intentim = Intent( this@MainActivity, MainActivity2::class.java)
                startActivity(intentim)
            }
        }
    }
}
