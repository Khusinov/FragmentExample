package com.khusinov.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        add_btn.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.add(R.id.container, firstFragment)
            beginTransaction.addToBackStack("first")
            beginTransaction.commit()
        }
        remove_btn.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.remove(firstFragment)
            beginTransaction.commit()

            }
        replace_btn.setOnClickListener {
            val supportFragmentManager = supportFragmentManager
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.container , secondFragment)
        }



    }
}