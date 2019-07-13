package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll:Button = findViewById(R.id.roll);

        roll.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
       val randomInt = java.util.Random().nextInt(6) + 1

       val dice_roll: ImageView = findViewById(R.id.dice_roll)

        val drawableResources = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dice_roll.setImageResource(drawableResources)
    }


}
