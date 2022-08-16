package com.vaom.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vaom.birthdaygreet.R
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import org.w3c.dom.Text


class BirthdayGreetingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        var name = ""
        name = intent.getStringExtra("name").toString()

            textView.text = "Happy Birthday $name"
        }
    }


