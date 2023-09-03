package com.example.kotlinapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll: Button = findViewById(R.id.btnRoll); 
        val dice = Dice(6)
        btnRoll.setOnClickListener {
            rollDice()
        }

        // Do a dice roll when the app starts
        rollDice()
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        val dice = Dice(6);
        val rolledValue = dice.roll()
        val tvRoll: TextView = findViewById(R.id.tvRoll)
        val diceImage: ImageView = findViewById(R.id.imgDice)
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)

        // Update the screen with dice roll
        tvRoll.text = rolledValue.toString()
//        diceImage.setImageResource(R.drawable.dice_2)
        val drawableResource = when(rolledValue){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the ImageView with the correct drawable resource ID and content description
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = rolledValue.toString()
        toast.show()
    }
}

