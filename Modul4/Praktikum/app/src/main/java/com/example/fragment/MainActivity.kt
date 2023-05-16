package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment.fragments.FragA
import com.example.fragment.fragments.FragB

class MainActivity : AppCompatActivity(),Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragA = FragA()
        // untuk memulai app dengan fragment A
        supportFragmentManager.beginTransaction().replace(R.id.fragmnet_container,fragA).commit()

    }

    override fun passData(editTextData: String) {
       val bundle = Bundle()
        bundle.putString("message",editTextData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragB = FragB()

        fragB.arguments = bundle
        //untuk mengirim data pada framentB dan membukanya
        transaction.replace(R.id.fragmnet_container,fragB).commit()
    }


}