package com.example.game

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.board_tic_tac_toe.*
import java.util.ArrayList
import kotlin.random.Random

class TicTacToe : AppCompatActivity() {

    private var turn = 0
    private var player1Score = 0
    private var player2Score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)
    }

    fun buttonClick(view: View) {
        val buttonSelected = view as Button
        var cellId = 0
        when(buttonSelected.id) {
            R.id.button1 -> cellId = 1
            R.id.button2 -> cellId = 2
            R.id.button3 -> cellId = 3
            R.id.button4 -> cellId = 4
            R.id.button5 -> cellId = 5
            R.id.button6 -> cellId = 6
            R.id.button7 -> cellId = 7
            R.id.button8 -> cellId = 8
            R.id.button9 -> cellId = 9
            R.id.button10 -> cellId = 10
            R.id.button11 -> cellId = 11
            R.id.button12 -> cellId = 12
            R.id.button13 -> cellId = 13
            R.id.button14 -> cellId = 14
            R.id.button15 -> cellId = 15
            R.id.button16 -> cellId = 16
            R.id.button17 -> cellId = 17
            R.id.button18 -> cellId = 18
            R.id.button19 -> cellId = 19
            R.id.button20 -> cellId = 20
            R.id.button21 -> cellId = 21
            R.id.button22 -> cellId = 22
            R.id.button23 -> cellId = 23
            R.id.button24 -> cellId = 24
            R.id.button25 -> cellId = 25
        }
        playGame(cellId, buttonSelected)
        turn++
        checkWinner()
    }

    private var player1 = ArrayList<Int>()
    private var player2 = ArrayList<Int>()
    private var activePlayer = 1

    private fun playGame(cellId: Int, buttonSelected: Button) {
        if(activePlayer == 1) {
            buttonSelected.text = "X"
            player1.add(cellId)
            buttonSelected.setTextColor(Color.parseColor("#FF008577"))
            activePlayer = 2
            autoPlayer()
        } else {
            buttonSelected.text = "O"
            player2.add(cellId)
            buttonSelected.setTextColor(Color.parseColor("#FF850023"))
            activePlayer = 1
        }
        buttonSelected.isEnabled = false
    }

    private fun checkWinner() {
        var winner = 0
        if(player1.contains(1) && player1.contains(2) && player1.contains(3) && player1.contains(4) && player1.contains(5)) {
            winner = 1
        } else if(player2.contains(1) && player2.contains(2) && player2.contains(3) && player2.contains(4) && player2.contains(5)) {
            winner = 2
        } else if(player1.contains(6) && player1.contains(7) && player1.contains(8) && player1.contains(9) && player1.contains(10)) {
            winner = 1
        } else if(player2.contains(6) && player2.contains(7) && player2.contains(8) && player2.contains(9) && player2.contains(10)) {
            winner = 2
        } else if(player1.contains(11) && player1.contains(12) && player1.contains(13) && player1.contains(14) && player1.contains(15)) {
            winner = 1
        } else if(player2.contains(11) && player2.contains(12) && player2.contains(13) && player2.contains(14) && player2.contains(15)) {
            winner = 2
        } else if(player1.contains(16) && player1.contains(17) && player1.contains(18) && player1.contains(19) && player1.contains(20)) {
            winner = 1
        } else if(player2.contains(16) && player2.contains(17) && player2.contains(18) && player2.contains(19) && player2.contains(20)) {
            winner = 2
        } else if(player1.contains(21) && player1.contains(22) && player1.contains(23) && player1.contains(24) && player1.contains(25)) {
            winner = 1
        } else if(player2.contains(21) && player2.contains(22) && player2.contains(23) && player2.contains(24) && player2.contains(25)) {
            winner = 2
        } else if(player1.contains(1) && player1.contains(6) && player1.contains(11) && player1.contains(16) && player1.contains(21)) {
            winner = 1
        } else if(player2.contains(1) && player2.contains(6) && player2.contains(11) && player2.contains(16) && player2.contains(21)) {
            winner = 2
        } else if(player1.contains(2) && player1.contains(7) && player1.contains(12) && player1.contains(17) && player1.contains(22)) {
            winner = 1
        } else if(player2.contains(2) && player2.contains(7) && player2.contains(12) && player2.contains(17) && player2.contains(22)) {
            winner = 2
        } else if(player1.contains(3) && player1.contains(8) && player1.contains(13) && player1.contains(18) && player1.contains(23)) {
            winner = 1
        } else if(player2.contains(3) && player2.contains(8) && player2.contains(13) && player2.contains(18) && player2.contains(23)) {
            winner = 2
        } else if(player1.contains(4) && player1.contains(9) && player1.contains(14) && player1.contains(19) && player1.contains(24)) {
            winner = 1
        } else if(player2.contains(4) && player2.contains(9) && player2.contains(14) && player2.contains(19) && player2.contains(24)) {
            winner = 2
        } else if(player1.contains(5) && player1.contains(10) && player1.contains(15) && player1.contains(20) && player1.contains(25)) {
            winner = 1
        } else if(player2.contains(5) && player2.contains(10) && player2.contains(15) && player2.contains(20) && player2.contains(25)) {
            winner = 2
        } else if(player1.contains(1) && player1.contains(7) && player1.contains(13) && player1.contains(19) && player1.contains(25)) {
            winner = 1
        } else if(player2.contains(1) && player2.contains(7) && player2.contains(13) && player2.contains(19) && player2.contains(25)) {
            winner = 2
        } else if(player1.contains(5) && player1.contains(9) && player1.contains(13) && player1.contains(17) && player1.contains(21)) {
            winner = 1
        } else if(player2.contains(5) && player2.contains(9) && player2.contains(13) && player2.contains(17) && player2.contains(21)) {
            winner = 2
        }
        if(winner != 0) {
            if(winner == 1) {
                player1Score++
                findViewById<TextView>(R.id.player1Score).text = "$player1Score"
            } else {
                player2Score++
                findViewById<TextView>(R.id.player2Score).text = "$player2Score"
            }
            restart()
            activePlayer = 1
            turn = 0
        } else if(turn == 25 && winner == 0) {
            restart()
            activePlayer = 1
            turn = 0
        }
    }

    private fun autoPlayer() {
        val emptyCells = ArrayList<Int>()
        emptyCells.add(-1)
        for(cellID in 1..25) {
            when {
                player1.contains(cellID) -> emptyCells.add(cellID, 1)
                player2.contains(cellID) -> emptyCells.add(cellID, 2)
                else -> emptyCells.add(cellID, 0)
            }
        }
        if(emptyCells.contains(0)) {
            for(i in 1..20 step 5) {
                if (emptyCells[i] == 2 && emptyCells[i + 1] == 2 && emptyCells[i + 2] == 2 && emptyCells[i + 3] == 2 && emptyCells[i + 4] == 0) {
                    setMove(i + 4)
                    return
                } else if (emptyCells[i] == 2 && emptyCells[i + 1] == 2 && emptyCells[i + 2] == 2 && emptyCells[i + 3] == 0 && emptyCells[i + 4] == 2) {
                    setMove(i + 3)
                    return
                } else if (emptyCells[i] == 2 && emptyCells[i + 1] == 2 && emptyCells[i + 2] == 0 && emptyCells[i + 3] == 2 && emptyCells[i + 4] == 2) {
                    setMove(i + 2)
                    return
                } else if (emptyCells[i] == 2 && emptyCells[i + 1] == 0 && emptyCells[i + 2] == 2 && emptyCells[i + 3] == 2 && emptyCells[i + 4] == 2) {
                    setMove(i + 1)
                    return
                } else if (emptyCells[i] == 0 && emptyCells[i + 1] == 2 && emptyCells[i + 2] == 2 && emptyCells[i + 3] == 2 && emptyCells[i + 4] == 2) {
                    setMove(i)
                    return
                }
            }
            for(i in 1..5) {
                if (emptyCells[i] == 2 && emptyCells[i + 5] == 2 && emptyCells[i + 10] == 2 && emptyCells[i + 15] == 2 && emptyCells[i + 20] == 0) {
                    setMove(i + 20)
                    return
                } else if (emptyCells[i] == 2 && emptyCells[i + 5] == 2 && emptyCells[i + 10] == 2 && emptyCells[i + 15] == 0 && emptyCells[i + 20] == 2) {
                    setMove(i + 15)
                    return
                } else if (emptyCells[i] == 2 && emptyCells[i + 5] == 2 && emptyCells[i + 10] == 0 && emptyCells[i + 15] == 2 && emptyCells[i + 20] == 2) {
                    setMove(i + 10)
                    return
                } else if (emptyCells[i] == 2 && emptyCells[i + 5] == 0 && emptyCells[i + 10] == 2 && emptyCells[i + 15] == 2 && emptyCells[i + 20] == 2) {
                    setMove(i + 5)
                    return
                } else if (emptyCells[i] == 0 && emptyCells[i + 5] == 2 && emptyCells[i + 10] == 2 && emptyCells[i + 15] == 2 && emptyCells[i + 20] == 2) {
                    setMove(i)
                    return
                }
            }
            if(emptyCells[1] == 2 && emptyCells[7] == 2 && emptyCells[13] == 2 && emptyCells[19] == 2 && emptyCells[25] == 0) {
                setMove(25)
                return
            } else if(emptyCells[1] == 2 && emptyCells[7] == 2 && emptyCells[13] == 2 && emptyCells[19] == 0 && emptyCells[25] == 2) {
                setMove(19)
                return
            } else if(emptyCells[1] == 2 && emptyCells[7] == 2 && emptyCells[13] == 0 && emptyCells[19] == 2 && emptyCells[25] == 2) {
                setMove(13)
                return
            } else if(emptyCells[1] == 2 && emptyCells[7] == 0 && emptyCells[13] == 2 && emptyCells[19] == 2 && emptyCells[25] == 2) {
                setMove(7)
                return
            } else if(emptyCells[1] == 0 && emptyCells[7] == 2 && emptyCells[13] == 2 && emptyCells[19] == 2 && emptyCells[25] == 2) {
                setMove(1)
                return
            } else if(emptyCells[5] == 2 && emptyCells[9] == 2 && emptyCells[13] == 2 && emptyCells[17] == 2 && emptyCells[21] == 0) {
                setMove(21)
                return
            } else if(emptyCells[5] == 2 && emptyCells[9] == 2 && emptyCells[13] == 2 && emptyCells[17] == 0 && emptyCells[21] == 2) {
                setMove(17)
                return
            } else if(emptyCells[5] == 2 && emptyCells[9] == 2 && emptyCells[13] == 0 && emptyCells[17] == 2 && emptyCells[21] == 2) {
                setMove(13)
                return
            } else if(emptyCells[5] == 2 && emptyCells[9] == 0 && emptyCells[13] == 2 && emptyCells[17] == 2 && emptyCells[21] == 2) {
                setMove(9)
                return
            } else if(emptyCells[5] == 0 && emptyCells[9] == 2 && emptyCells[13] == 2 && emptyCells[17] == 2 && emptyCells[21] == 2) {
                setMove(5)
                return
            }
            for(i in 1..20 step 5) {
                if (emptyCells[i] == 1 && emptyCells[i + 1] == 1 && emptyCells[i + 2] == 1 && emptyCells[i + 3] == 1 && emptyCells[i + 4] == 0) {
                    setMove(i + 4)
                    return
                } else if (emptyCells[i] == 1 && emptyCells[i + 1] == 1 && emptyCells[i + 2] == 1 && emptyCells[i + 3] == 0 && emptyCells[i + 4] == 1) {
                    setMove(i + 3)
                    return
                } else if (emptyCells[i] == 1 && emptyCells[i + 1] == 1 && emptyCells[i + 2] == 0 && emptyCells[i + 3] == 1 && emptyCells[i + 4] == 1) {
                    setMove(i + 2)
                    return
                } else if (emptyCells[i] == 1 && emptyCells[i + 1] == 0 && emptyCells[i + 2] == 1 && emptyCells[i + 3] == 1 && emptyCells[i + 4] == 1) {
                    setMove(i + 1)
                    return
                } else if (emptyCells[i] == 0 && emptyCells[i + 1] == 1 && emptyCells[i + 2] == 1 && emptyCells[i + 3] == 1 && emptyCells[i + 4] == 1) {
                    setMove(i)
                    return
                }
            }
            for(i in 1..5) {
                if (emptyCells[i] == 1 && emptyCells[i + 5] == 1 && emptyCells[i + 10] == 1 && emptyCells[i + 15] == 1 && emptyCells[i + 20] == 0) {
                    setMove(i + 20)
                    return
                } else if (emptyCells[i] == 1 && emptyCells[i + 5] == 1 && emptyCells[i + 10] == 1 && emptyCells[i + 15] == 0 && emptyCells[i + 20] == 1) {
                    setMove(i + 15)
                    return
                } else if (emptyCells[i] == 1 && emptyCells[i + 5] == 1 && emptyCells[i + 10] == 0 && emptyCells[i + 15] == 1 && emptyCells[i + 20] == 1) {
                    setMove(i + 10)
                    return
                } else if (emptyCells[i] == 1 && emptyCells[i + 5] == 0 && emptyCells[i + 10] == 1 && emptyCells[i + 15] == 1 && emptyCells[i + 20] == 1) {
                    setMove(i + 5)
                    return
                } else if (emptyCells[i] == 0 && emptyCells[i + 5] == 1 && emptyCells[i + 10] == 1 && emptyCells[i + 15] == 1 && emptyCells[i + 20] == 1) {
                    setMove(i)
                    return
                }
            }
            if(emptyCells[1] == 1 && emptyCells[7] == 1 && emptyCells[13] == 1 && emptyCells[19] == 1 && emptyCells[25] == 0) {
                setMove(25)
                return
            } else if(emptyCells[1] == 1 && emptyCells[7] == 1 && emptyCells[13] == 1 && emptyCells[19] == 0 && emptyCells[25] == 1) {
                setMove(19)
                return
            } else if(emptyCells[1] == 1 && emptyCells[7] == 1 && emptyCells[13] == 0 && emptyCells[19] == 1 && emptyCells[25] == 1) {
                setMove(13)
                return
            } else if(emptyCells[1] == 1 && emptyCells[7] == 0 && emptyCells[13] == 1 && emptyCells[19] == 1 && emptyCells[25] == 1) {
                setMove(7)
                return
            } else if(emptyCells[1] == 0 && emptyCells[7] == 1 && emptyCells[13] == 1 && emptyCells[19] == 1 && emptyCells[25] == 1) {
                setMove(1)
                return
            } else if(emptyCells[5] == 1 && emptyCells[9] == 1 && emptyCells[13] == 1 && emptyCells[17] == 1 && emptyCells[21] == 0) {
                setMove(21)
                return
            } else if(emptyCells[5] == 1 && emptyCells[9] == 1 && emptyCells[13] == 1 && emptyCells[17] == 0 && emptyCells[21] == 1) {
                setMove(17)
                return
            } else if(emptyCells[5] == 1 && emptyCells[9] == 1 && emptyCells[13] == 0 && emptyCells[17] == 1 && emptyCells[21] == 1) {
                setMove(13)
                return
            } else if(emptyCells[5] == 1 && emptyCells[9] == 0 && emptyCells[13] == 1 && emptyCells[17] == 1 && emptyCells[21] == 1) {
                setMove(9)
                return
            } else if(emptyCells[5] == 0 && emptyCells[9] == 1 && emptyCells[13] == 1 && emptyCells[17] == 1 && emptyCells[21] == 1) {
                setMove(5)
                return
            }
            while(true) {
                val random = Random.nextInt(1, emptyCells.size)
                if (emptyCells[random] == 0) {
                    setMove(random)
                    return
                }
            }

        }
    }

    private fun setMove(cellID: Int) {
        val buttonSelected: Button
        when(cellID) {
            1 -> buttonSelected = button1
            2 -> buttonSelected = button2
            3 -> buttonSelected = button3
            4 -> buttonSelected = button4
            5 -> buttonSelected = button5
            6 -> buttonSelected = button6
            7 -> buttonSelected = button7
            8 -> buttonSelected = button8
            9 -> buttonSelected = button9
            10 -> buttonSelected = button10
            11 -> buttonSelected = button11
            12 -> buttonSelected = button12
            13 -> buttonSelected = button13
            14 -> buttonSelected = button14
            15 -> buttonSelected = button15
            16 -> buttonSelected = button16
            17 -> buttonSelected = button17
            18 -> buttonSelected = button18
            19 -> buttonSelected = button19
            20 -> buttonSelected = button20
            21 -> buttonSelected = button21
            22 -> buttonSelected = button22
            23 -> buttonSelected = button23
            24 -> buttonSelected = button24
            25 -> buttonSelected = button25
            else -> buttonSelected = button1
        }
        turn++
        playGame(cellID, buttonSelected)
    }

    private fun restart() {
        button1.text = ""
        button2.text = ""
        button3.text = ""
        button4.text = ""
        button5.text = ""
        button6.text = ""
        button7.text = ""
        button8.text = ""
        button9.text = ""
        button10.text = ""
        button11.text = ""
        button12.text = ""
        button13.text = ""
        button14.text = ""
        button15.text = ""
        button16.text = ""
        button17.text = ""
        button18.text = ""
        button19.text = ""
        button20.text = ""
        button21.text = ""
        button22.text = ""
        button23.text = ""
        button24.text = ""
        button25.text = ""
        player1.clear()
        player2.clear()
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
    }

}
