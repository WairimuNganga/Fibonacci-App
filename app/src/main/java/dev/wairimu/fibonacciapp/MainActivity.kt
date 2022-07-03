package dev.wairimu.fibonacciapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wairimu.fibonacciapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciNumbers()
    }
    fun fibonacciNumbers(){
        var startNum = 0
        var endNum = 1

        var numbersList = mutableListOf<Int>()
       for (num in 1..100){
           numbersList.add(startNum)
           var sum = startNum + endNum
           startNum = endNum
           endNum = sum

       }
        var numbersAdapter = NumbersRecyclerViewAdapter(numbersList)
        binding.rvSum.layoutManager = LinearLayoutManager(this)
        binding.rvSum.adapter = numbersAdapter
    }


    }

