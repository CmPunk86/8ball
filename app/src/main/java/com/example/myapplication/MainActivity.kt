package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val askMeButton: Button = findViewById(R.id.button)
        askMeButton.setOnClickListener { shakeball() }
    }

    private fun shakeball() {
        val ballImageView: ImageView = findViewById(R.id.imageView)
        val randomChoice = Random.nextInt(20) + 1
        val imageResource = when (randomChoice) {
            1 -> R.drawable.magic_8_ball_1
            2 -> R.drawable.magic_8_ball_2
            3 -> R.drawable.magic_8_ball_3
            4 -> R.drawable.magic_8_ball_4
            5 -> R.drawable.magic_8_ball_5
            6 -> R.drawable.magic_8_ball_6
            7 -> R.drawable.magic_8_ball_7
            8 -> R.drawable.magic_8_ball_8
            9 -> R.drawable.magic_8_ball_9
            10 -> R.drawable.magic_8_ball_10
            11 -> R.drawable.magic_8_ball_11
            12 -> R.drawable.magic_8_ball_12
            13 -> R.drawable.magic_8_ball_13
            14 -> R.drawable.magic_8_ball_14
            15 -> R.drawable.magic_8_ball_15
            16 -> R.drawable.magic_8_ball_16
            17 -> R.drawable.magic_8_ball_17
            18 -> R.drawable.magic_8_ball_18
            19 -> R.drawable.magic_8_ball_19
            else -> R.drawable.magic_8_ball_20
        }
    ballImageView.setImageResource(imageResource)
    }
}