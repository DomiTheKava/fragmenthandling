package com.example.fragmenthandling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.fragmenthandling.fragments.fragment1
import com.example.fragmenthandling.fragments.fragment2

class MainActivity : AppCompatActivity(), Comm1 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)

        val frag1 = fragment1()
        val frag2 = fragment2()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, frag1)
            commit()
        }
        
        button.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, frag1)
                addToBackStack(null)
                commit()
            }
        }

        button2.setOnClickListener() {
            supportFragmentManager.beginTransaction().apply {
                val etbtn = findViewById<EditText>(R.id.editTextText)
                frag2.arguments = PassTheData(etbtn.text.toString())

                replace(R.id.fragmentContainer, frag2)
                addToBackStack(null)
                commit()
            }
        }
    }

    // our interface
    override fun PassTheData(passingText: String): Bundle {
        val bundle: Bundle = Bundle()

        bundle.putString("AtoB", passingText )

        return bundle
    }

}