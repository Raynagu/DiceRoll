package com.admin.diceroll

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       set click listener
        rollBtn.setOnClickListener {

//generate random number within range(1 to 6) using kotlin random() in when statement and return the matching resource
            val diceSource1 = when((1..6).random()){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }


            val diceSource2 = when((1..6).random()){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }

//            set Image resource
            dice1.setImageResource(diceSource1)
            dice2.setImageResource(diceSource2)
        }
    }
}
