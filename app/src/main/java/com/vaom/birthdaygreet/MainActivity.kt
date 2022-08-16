package com.vaom.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdaycard(view: View) {

        var name = ""
        name = nameInput.editableText.toString()
        if (name == "") {
            Toast.makeText(this, "ENTER A NAME", Toast.LENGTH_LONG).show()
        } else {
            name=name
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)


        }
    }
}


