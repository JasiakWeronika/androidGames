package com.example.game

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class StonePaperScissors : AppCompatActivity() {

    private val random = Random()

    private var userScore = 0
    private var computerScore = 0

    private var rockButton: Button? = null
    private var paperButton: Button? = null
    private var scissorsButton: Button? = null

    private var userView: ImageView? = null
    private var computerView: ImageView? = null

    private var userChoice: String = ""
    private var computerChoice: String = ""
    private var score: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stone_paper_scissors)
        rockButton = findViewById(R.id.rockButton)
        paperButton = findViewById(R.id.paperButton)
        scissorsButton = findViewById(R.id.scissorsButton)

        userView = findViewById(R.id.userView)
        computerView = findViewById(R.id.computerView)

        rockButton?.setOnClickListener {
            userChoice = "rock"
            userView?.setImageResource(R.drawable.rock)
            calculate()
        }

        paperButton?.setOnClickListener {
            userChoice = "paper"
            userView?.setImageResource(R.drawable.paper)
            calculate()
        }

        scissorsButton?.setOnClickListener {
            userChoice = "scissors"
            userView?.setImageResource(R.drawable.scissors)
            calculate()
        }
    }

    private fun calculate() {
        val value = random.nextInt(3)

        when (value) {
            0 -> {
                computerChoice = "rock"
                computerView?.setImageResource(R.drawable.rock)
            }
            1 -> {
                computerChoice = "paper"
                computerView?.setImageResource(R.drawable.paper)
            }
            2 -> {
                computerChoice = "scissors"
                computerView?.setImageResource(R.drawable.scissors)
            }
        }

        if(userChoice == "rock" && computerChoice == "paper") {
            score = "Przegrałeś"
            computerScore++
            color(2)
        } else if(userChoice == "rock" && computerChoice == "scissors") {
            score = "Wygrałeś"
            userScore++
            color(1)
        } else if(userChoice == "paper" && computerChoice == "rock") {
            score = "Wygrałeś"
            userScore++
            color(1)
        } else if(userChoice == "paper" && computerChoice == "scissors") {
            score = "Przegrałeś"
            computerScore++
            color(2)
        } else if(userChoice == "scissors" && computerChoice == "rock") {
            score = "Przegrałeś"
            computerScore++
            color(2)
        } else if(userChoice == "scissors" && computerChoice == "paper") {
            score = "Wygrałeś"
            userScore++
            color(1)
        } else if(userChoice == "rock" && computerChoice == "rock") {
            score = "Remis"
            color(0)
        } else if(userChoice == "paper" && computerChoice == "paper") {
            score = "Remis"
            color(0)
        } else if(userChoice == "scissors" && computerChoice == "scissors") {
            score = "Remis"
            color(0)
        }
        findViewById<TextView>(R.id.userScore).text = "$userScore"
        findViewById<TextView>(R.id.computerScore).text = "$computerScore"
        findViewById<TextView>(R.id.comment).text = "$score"
    }
    private fun color(w: Int) {
        when (w) {
            1 -> findViewById<TextView>(R.id.comment).setTextColor(Color.parseColor("#0b6623"))
            2 -> findViewById<TextView>(R.id.comment).setTextColor(Color.parseColor("#ff0000"))
            0 -> findViewById<TextView>(R.id.comment).setTextColor(Color.parseColor("#ffd300"))
        }
    }

}
