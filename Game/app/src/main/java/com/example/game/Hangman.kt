package com.example.game

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.board_hangman.*
import kotlin.random.Random

class Hangman : AppCompatActivity() {
    private var images: Array<ImageView?>? = null
    private var numberParts = 6
    private var currentPart = 0
    private var numberOfChars = 0
    private var numberCorrect = 0
    private var words: Array<String?>? = null
    private var currentWord: String = ""
    private var charView: Array<TextView?>? = null
    private var wordLayout: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)
        val resources = resources
        words = resources.getStringArray(R.array.words)
        currentWord = ""
        wordLayout = findViewById(R.id.word)
        images = arrayOfNulls(numberParts)
        images!![0] = findViewById(R.id.head)
        images!![1] = findViewById(R.id.body)
        images!![2] = findViewById(R.id.arm1)
        images!![3] = findViewById(R.id.arm2)
        images!![4] = findViewById(R.id.leg1)
        images!![5] = findViewById(R.id.leg2)
        playGame()
    }

    private fun playGame() {
        var newWord = words?.get(Random.nextInt(words!!.size))
        while(newWord == currentWord) {
            newWord = words?.get(Random.nextInt(words!!.size))
        }
        currentWord = newWord.toString()
        charView = arrayOfNulls(currentWord.length)
        wordLayout?.removeAllViews()
        for(i in 0 until currentWord.length) {
            charView!![i] = TextView(this)
            charView?.get(i)?.text = "_"
            charView?.get(i)?.layoutParams = LinearLayout.LayoutParams(100, LinearLayout.LayoutParams.WRAP_CONTENT)
            charView?.get(i)?.gravity = Gravity.CENTER
            wordLayout?.addView(charView?.get(i))
        }
        currentPart = 0
        numberOfChars = currentWord.length
        numberCorrect = 0
        for (i in 0 until  numberParts) {
            images?.get(i)?.visibility = View.INVISIBLE
        }
    }

    fun buttonSelected(view: View) {
        val letter = (view as TextView).text.toString()
        val letterChar = letter[0]
        view.isEnabled = false
        var correct = false
        for(i in 0 until currentWord.length) {
            if(currentWord[i] == letterChar) {
                correct = true
                numberCorrect++
                charView?.get(i)?.text = currentWord[i].toString()
            }
        }
        if(correct) {
            if(numberCorrect == numberOfChars) {
                disableButtons()
                Toast.makeText(this, "Wygrałeś!", Toast.LENGTH_LONG).show()
                playGame()
            }
        } else if(currentPart < numberParts) {
            images?.get(currentPart)?.visibility  = View.VISIBLE
            currentPart++
            if(currentPart == 6) {
                disableButtons()
                Toast.makeText(this, "Przegrałeś!", Toast.LENGTH_LONG).show()
                playGame()
            }
        } else {
            disableButtons()
            Toast.makeText(this, "Przegrałeś!", Toast.LENGTH_LONG).show()
            playGame()
        }
    }

    private fun disableButtons() {
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true
        button10.isEnabled = true
        button11.isEnabled = true
        button12.isEnabled = true
        button13.isEnabled = true
        button14.isEnabled = true
        button15.isEnabled = true
        button16.isEnabled = true
        button17.isEnabled = true
        button18.isEnabled = true
        button19.isEnabled = true
        button20.isEnabled = true
        button21.isEnabled = true
        button22.isEnabled = true
        button23.isEnabled = true
        button24.isEnabled = true
        button25.isEnabled = true
        button26.isEnabled = true
        button27.isEnabled = true
        button28.isEnabled = true
        button29.isEnabled = true
        button30.isEnabled = true
        button31.isEnabled = true
        button32.isEnabled = true
        button33.isEnabled = true
        button34.isEnabled = true
        button35.isEnabled = true
    }
}
