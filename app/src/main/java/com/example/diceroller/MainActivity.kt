package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var diceimage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button :Button = findViewById<Button>(R.id.roll_button)
        roll_button.setOnClickListener{
                DiceRoll()
        }
        diceimage = findViewById(R.id.DiceImage) //get the reference only one time.
    }

    private fun DiceRoll() {
        var random: Int = Random().nextInt(6) +1
        //var diceimage:ImageView = findViewById<ImageView>(R.id.DiceImage)//this is expensive
        val resource = when(random){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //based on the random integer generated we can decide the resource that needs to be drawn
        //in the ImageView of diceimage and so we can set the Image resource as needed
        diceimage.setImageResource(resource)
    }
}