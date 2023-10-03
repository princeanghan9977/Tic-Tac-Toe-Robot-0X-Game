package com.tictactoegamerobot


import android.content.Intent
import android.content.SharedPreferences
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    companion object {

        var count2 = 0
        var count4 = 0
        lateinit var sp: SharedPreferences
        lateinit var editor: SharedPreferences.Editor


        var seet: Int = 0

    }

    var c1 = 0
    var c2 = 0
    var c3 = 0
    var c4 = 0


    lateinit var main: MainActivity

    var array = arrayOf<String>("", "", "", "", "", "", "", "", "")


    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var b3: Button
    lateinit var b4: Button
    lateinit var b5: Button
    lateinit var b6: Button
    lateinit var b7: Button
    lateinit var b8: Button
    lateinit var b9: Button

    lateinit var OO: TextView
    lateinit var XX: TextView

    lateinit var restart: Button
    lateinit var Reset: ImageView

    var count = 0
    var cnt = 0
    var count3 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        restart = findViewById(R.id.restart)
        Reset = findViewById(R.id.Reset)



        OO = findViewById(R.id.OO)
        XX = findViewById(R.id.XX)

        sp = getSharedPreferences("get", MODE_PRIVATE)
        editor = sp.edit()


        var set = intent.getIntExtra("get", 0)

        seet = set

        Log.d("===========", "onCreate: set ${set}")
        Log.d("===========", "onCreate: seet $seet")

        setwintext()

        if (set == 2) {
            b1.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b1.text == "") {
                        count++

                        var a = click(count)
                        b1.text = a
                    }
                }

                win()


            }

            b2.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b2.text == "") {
                        count++

                        var a = click(count)
                        b2.text = a
                    }
                }
                win()

            }

            b3.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b3.text == "") {
                        count++

                        var a = click(count)
                        b3.text = a
                    }
                }
                win()

            }

            b4.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b4.text == "") {
                        count++

                        var a = click(count)
                        b4.text = a
                    }
                }
                win()

            }
            b5.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b5.text == "") {
                        count++

                        var a = click(count)
                        b5.text = a
                    }
                }
                win()

            }
            b6.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b6.text == "") {
                        count++

                        var a = click(count)
                        b6.text = a
                    }
                }
                win()
            }
            b7.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b7.text == "") {
                        count++

                        var a = click(count)
                        b7.text = a
                    }
                }
                win()

            }
            b8.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b8.text == "") {
                        count++

                        var a = click(count)
                        b8.text = a
                    }
                }
                win()

            }
            b9.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b9.text == "") {
                        count++

                        var a = click(count)
                        b9.text = a
                    }
                }
                win()

            }
        }




        if (set == 1) {
            b1.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b1.text == "") {
                        b1.text = "0"
                        array[0] = "0"

                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b2.text.isNotEmpty() && b4.text.isNotEmpty() && b5.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)
                                    if (count3 == 0) {

                                        if (aa == 1 || aa == 3 || aa == 4) {
                                            if (array[aa] == "") {

                                                array[aa] = "X"
                                                win()
                                                assing()
                                                break
                                            }
                                        }

                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }



            b2.setOnClickListener {

                if (count2 == 0 && count4 == 0) {
                    if (b2.text == "") {
                        b2.text = "0"
                        array[1] = "0"

                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b1.text.isNotEmpty() && b3.text.isNotEmpty() && b5.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 0 || aa == 2 || aa == 4)
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()

                                                break

                                            }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }



            b3.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b3.text == "") {
                        b3.text = "0"
                        array[2] = "0"

                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b2.text.isNotEmpty() && b5.text.isNotEmpty() && b6.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 1 || aa == 4 || aa == 5) {
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()
                                                break
                                            }
                                        }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }

            b4.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b4.text == "") {
                        b4.text = "0"
                        array[3] = "0"

                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++

                            if (cnt <= 4) {
                                if (b1.text.isNotEmpty() && b5.text.isNotEmpty() && b7.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 0 || aa == 4 || aa == 6) {
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()
                                                break
                                            }
                                        }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }


            }
            b5.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b5.text == "") {
                        b5.text = "0"
                        array[4] = "0"

                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                while (true) {
                                    var aa = Random().nextInt(9)
                                    if (array[aa] == "") {
                                        array[aa] = "X"
                                        assing()
                                        win()
                                        break

                                    }
                                }
                            }
                        }
                    }
                }


            }
            b6.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b6.text == "") {
                        b6.text = "0"
                        array[5] = "0"
                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b3.text.isNotEmpty() && b5.text.isNotEmpty() && b9.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 2 || aa == 4 || aa == 8) {
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()
                                                break
                                            }
                                        }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }


            }
            b7.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b7.text == "") {
                        b7.text = "0"
                        array[6] = "0"
                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b4.text.isNotEmpty() && b5.text.isNotEmpty() && b8.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 3 || aa == 4 || aa == 7) {
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()
                                                break
                                            }
                                        }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
            b8.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b8.text == "") {
                        b8.text = "0"
                        array[7] = "0"
                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b5.text.isNotEmpty() && b7.text.isNotEmpty() && b9.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 4 || aa == 6 || aa == 8) {
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()
                                                break
                                            }
                                        }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b9.setOnClickListener {
                if (count2 == 0 && count4 == 0) {
                    if (b9.text == "") {
                        b9.text = "0"
                        array[8] = "0"
                        win()
                        if (count2 == 0 && count4 == 0) {

                            cnt++
                            if (cnt <= 4) {
                                if (b5.text.isNotEmpty() && b6.text.isNotEmpty() && b8.text.isNotEmpty()) {
                                    count3++
                                }
                                while (true) {
                                    var aa = Random().nextInt(9)

                                    if (count3 == 0) {
                                        if (aa == 4 || aa == 5 || aa == 7) {
                                            if (array[aa] == "") {
                                                array[aa] = "X"
                                                assing()
                                                win()
                                                break
                                            }
                                        }
                                    } else {
                                        if (array[aa] == "") {
                                            array[aa] = "X"
                                            assing()
                                            win()
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        restart.setOnClickListener {

            array = arrayOf<String>("", "", "", "", "", "", "", "", "")

            assing()

            cnt = 0
            count = 0
            count2 = 0
            count3 = 0
            count4 = 0
        }

        Reset.setOnClickListener {

            if (seet == 1) {
                c1 = 0
                c3 = 0
                editor.putInt("set0", c1)
                editor.putInt("setX", c3)
                editor.apply()

                Log.d("===========", "onCreate: c1 ${c1}")
                Log.d("===========", "onCreate: c3 ${c3}")

            } else if (seet == 2) {
                c2 = 0
                editor.putInt("set00", c2)
                c4 = 0
                editor.putInt("setXX", c4)
                editor.apply()
                Log.d("===========", "onCreate: c2 ${c2}")
                Log.d("===========", "onCreate: c4 ${c4}")
            }
            setwintext()

        }


    }

    fun setwintext() {

        if (seet == 1) {

            c1 = sp.getInt("set0", 0)
            OO.text = "0 = ${c1}"

            c3 = sp.getInt("setX", 0)
            XX.text = "X = ${c3}"

//            startActivity(Intent(this@MainActivity,winpage::class.java))

        } else {

            c2 = sp.getInt("set00", 0)
            OO.text = "0 = ${c2}"

            c4 = sp.getInt("setXX", 0)
            XX.text = "X = ${c4}"


//            startActivity(Intent(this@MainActivity,winpage::class.java))

        }
    }


    private fun click(count: Int): String {

        if (count % 2 == 0) {
            return "X"
        } else {
            return "0"
        }

    }


    fun win() {

        if (b1.text == "0" && b2.text == "0" && b3.text == "0" ||
            b4.text == "0" && b5.text == "0" && b6.text == "0" ||
            b7.text == "0" && b8.text == "0" && b9.text == "0" ||

            b1.text == "0" && b4.text == "0" && b7.text == "0" ||
            b2.text == "0" && b5.text == "0" && b8.text == "0" ||
            b3.text == "0" && b6.text == "0" && b9.text == "0" ||

            b1.text == "0" && b5.text == "0" && b9.text == "0" ||
            b3.text == "0" && b5.text == "0" && b7.text == "0"
        ) {
            count2++


            Toast.makeText(this, "0 Is Win", Toast.LENGTH_SHORT).show()

            Log.d("===========", "onCreate: seet $seet")


            if (seet == 1) {
                c1++
                editor.putInt("set0", c1)
                editor.apply()
                Log.d("===========", "onCreate: c1 ${c1}")
            } else if (seet == 2) {
                c2++
                editor.putInt("set00", c2)
                editor.apply()
                Log.d("===========", "onCreate: c2 ${c2}")
            }
            setwintext()

        } else if (

            b1.text == "X" && b2.text == "X" && b3.text == "X" ||
            b4.text == "X" && b5.text == "X" && b6.text == "X" ||
            b7.text == "X" && b8.text == "X" && b9.text == "X" ||

            b1.text == "X" && b4.text == "X" && b7.text == "X" ||
            b2.text == "X" && b5.text == "X" && b8.text == "X" ||
            b3.text == "X" && b6.text == "X" && b9.text == "X" ||

            b1.text == "X" && b5.text == "X" && b9.text == "X" ||
            b3.text == "X" && b5.text == "X" && b7.text == "X"
        ) {

            count4++


            Toast.makeText(this, "X Is Win", Toast.LENGTH_SHORT).show()
            Log.d("===========", "onCreate: seet $seet")


            if (seet == 1) {

                c3++
                editor.putInt("setX", c3)
                editor.apply()
                Log.d("===========", "onCreate: c3 ${c3}")

            } else if (seet == 2) {
                c4++
                editor.putInt("setXX", c4)
                editor.apply()
                Log.d("===========", "onCreate: c4 ${c4}")
            }
            setwintext()

        } else if (b1.text.isNotEmpty() && b2.text.isNotEmpty() && b3.text.isNotEmpty() && b4.text.isNotEmpty() && b5.text.isNotEmpty() &&
            b6.text.isNotEmpty() && b7.text.isNotEmpty() && b8.text.isNotEmpty() && b9.text.isNotEmpty()
        ) {
            count2++
            Toast.makeText(this, "Game Over Restart Game", Toast.LENGTH_SHORT).show()
        }


    }


    fun assing() {

        b1.text = array[0]
        b2.text = array[1]
        b3.text = array[2]
        b4.text = array[3]
        b5.text = array[4]
        b6.text = array[5]
        b7.text = array[6]
        b8.text = array[7]
        b9.text = array[8]
    }


    override fun onBackPressed() {

        count2 = 0
        count3 = 0
        count4 = 0
        array = arrayOf<String>("", "", "", "", "", "", "", "", "")
        startActivity(Intent(this@MainActivity, AskQustionActivity::class.java))
        finish()
    }
}



