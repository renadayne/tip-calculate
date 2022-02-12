package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercent = tipPercentageEdit.text.toString().toDouble() / 100
            val tip = bill * tipPercent
            val total = tip + bill

            infoTextView.visibility = View.VISIBLE

            infoTextView.text = "Tip : ${doubleToDollar(tip)} + Total: ${doubleToDollar(total)}"

        }

    }
    fun doubleToDollar(Tus:Double) : String {
        return "$" + String.format("%.2f",Tus)
    }
}