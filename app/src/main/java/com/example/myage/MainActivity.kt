package com.example.myage

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.showInput1.setOnClickListener {
            val firstNumber = if (binding.editText1.text.isNullOrBlank()) 0 else binding.editText1.text.toString().toInt()
            val secondNumber = if (binding.editText2.text.isNullOrBlank()) 0 else binding.editText2.text.toString().toInt()
            val sum:Int = firstNumber + secondNumber
            Toast.makeText(this, "$sum", Toast.LENGTH_SHORT).show()
            binding.txtVw1.text = "SUM IS: $sum"
        }
        binding.showInput2.setOnClickListener {
            val firstNumber = if (binding.editText1.text.isNullOrBlank()) 0 else binding.editText1.text.toString().toInt()
            val secondNumber = if (binding.editText2.text.isNullOrBlank()) 0 else binding.editText2.text.toString().toInt()
            val Multiply:Int = firstNumber * secondNumber
            Toast.makeText(this, "$Multiply", Toast.LENGTH_SHORT).show()
            binding.txtVw2.text = "MULTIPLICATION IS: $Multiply"
        }

    }
}