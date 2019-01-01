package com.example.antoniodonato.testas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*
import kotlin.collections.RandomAccess

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber(){
        //get from intent extra
        val count = intent.getIntExtra(TOTAL_COUNT,0)

        //generate random
        val random = Random()
        var randomInt = 0

        if (count>0){
            randomInt=random.nextInt(count+1)
        }

        findViewById<TextView>(R.id.textView_random).text = Integer.toString(randomInt)

        findViewById<TextView>(R.id.textView_label).text = getString(R.string.random_heading, count)
    }
}
