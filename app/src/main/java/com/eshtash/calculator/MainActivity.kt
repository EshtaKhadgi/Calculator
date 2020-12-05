package com.eshtash.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btndivide: Button
    private lateinit var btnmultiply: Button
    private lateinit var btnclear: Button
    private lateinit var btnadd: Button
    private lateinit var btnsubtract: Button
    private lateinit var btntotal: Button
    private lateinit var tvbackground: TextView
    private lateinit var etdisplay: EditText
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    private lateinit var btn0: Button

    var first: Int = 0;
    var second: Int = 0;
    var total: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Value asssigning
        btndivide = findViewById(R.id.btndivide)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnadd = findViewById(R.id.btnadd)
        btnsubtract = findViewById(R.id.btnsubtract)
        btnclear = findViewById(R.id.btnclear)
        btntotal = findViewById(R.id.btntotal)
        tvbackground = findViewById(R.id.tvbackground)
        etdisplay = findViewById(R.id.etdisplay)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn0 = findViewById(R.id.btn0)



        btn1.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "1")
        }
        btn2.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "2")
        }
        btn3.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "3")
        }
        btn4.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "4")
        }
        btn5.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "5")
        }
        btn6.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "6")
        }
        btn7.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "7")
        }
        btn8.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "8")
        }
        btn9.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "9")
        }
        btn0.setOnClickListener {
            if (etdisplay.getText().toString()=="0"){
                etdisplay.setText("")
            }
            etdisplay.setText(etdisplay.getText().toString() + "0")
        }


        btnadd.setOnClickListener {
            if (tvbackground.text == "") {
                first = etdisplay.text.toString().toInt()
                etdisplay.setText("")
                tvbackground.text = "+"
            }
            else {
                tvbackground.text = ""
                tvbackground.text = "+"
            }

        }
        btnsubtract.setOnClickListener {
            if (tvbackground.text == "") {
                first = etdisplay.text.toString().toInt()
                etdisplay.setText("")
                tvbackground.text = "-"
            }
            else {
                tvbackground.text = ""
                tvbackground.text = "-"
            }
        }
        btnmultiply.setOnClickListener {
            if (tvbackground.text == "") {
                first = etdisplay.text.toString().toInt()
                etdisplay.setText("")
                tvbackground.text = "*"
            }
            else {
                tvbackground.text = ""
                tvbackground.text = "*"
            }
        }
        btndivide.setOnClickListener {
            if (tvbackground.text == "") {
                first = etdisplay.text.toString().toInt()
                etdisplay.setText("")
                tvbackground.text = "/"
            }
            else {
                tvbackground.text = ""
                tvbackground.text = "/"
            }
        }

        btntotal.setOnClickListener {
            second = etdisplay.text.toString().toInt()
            if(tvbackground.text == "+") {
                total = first + second
            }
            else if(tvbackground.text == "-") {
                total = first - second
            }
            else if(tvbackground.text == "*") {
                total = first * second
            }
            else if(tvbackground.text == "/") {
                total = first / second
            }
            tvbackground.text = ""
            etdisplay.setText("$total")
        }

        btnclear.setOnClickListener {
            clear()
        }

    }
    private fun clear() {
        tvbackground.text =""
        etdisplay.setText("")
        total = 0
        first = 0
        second = 0
    }
}