package com.example.lotto

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num6 =findViewById<Button>(R.id.lottoNum6)
        val num5 =findViewById<Button>(R.id.lottoNum5)
        val num4 =findViewById<Button>(R.id.lottoNum4)
        val num3 =findViewById<Button>(R.id.lottoNum3)
        val num2 =findViewById<Button>(R.id.lottoNum2)
        val num1 =findViewById<Button>(R.id.lottoNum1)

        findViewById<FloatingActionButton>(R.id.runButton).setOnClickListener{
            Log.d("로또앱", "버튼 누름")

            num6.text ="45"
            num6.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,255,0))

            num5.text ="25"
            num5.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,0,0))

            num4.text ="24"
            num4.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,0,0))

            num3.text ="10"
            num3.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,255,0))

            num2.text ="8"
            num2.backgroundTintList = ColorStateList.valueOf(Color.rgb(255,255,0))

            num1.text ="13"
            num1.backgroundTintList = ColorStateList.valueOf(Color.rgb(0,0,255))

        }
    }
}