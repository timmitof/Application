package com.timmitof.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {
    lateinit var diaryBtn: ImageButton
    lateinit var calendarBtn: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}