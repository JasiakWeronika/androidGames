package com.example.game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun stonePaperScissorsGame(view: View) {
        val intent = Intent(this, StonePaperScissors::class.java)
        startActivity(intent)
    }

    fun ticTacToeGame(view: View) {
        val intent = Intent(this, TicTacToe::class.java)
        startActivity(intent)
    }

    fun hangmanGame(view: View) {
        val intent = Intent(this, Hangman::class.java)
        startActivity(intent)
    }
}
