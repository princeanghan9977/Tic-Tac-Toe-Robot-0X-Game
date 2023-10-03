package com.tictactoegamerobot

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import com.tictacgamerobot.R

class
AskQustionActivity : AppCompatActivity() {

    var color = 0

    var count = 0
    var get = 0
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var start: Button

    lateinit var star: ImageView
    lateinit var shear: ImageView
    lateinit var policy: ImageView
    lateinit var consol: ImageView

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask_qustion)

        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        start = findViewById(R.id.start)

        star = findViewById(R.id.star)
        shear = findViewById(R.id.shear)
        policy = findViewById(R.id.policy)
        consol = findViewById(R.id.consol)

        star.setOnClickListener {

        }

        shear.setOnClickListener {
            ShareCompat.IntentBuilder.from(this)
                .setType("text/plain")
                .setText(
                    "Play Game With Friend\n" + "Play Game With Robot\n" + "Enjoy This Game\n\n".plus(
                        "http://play.google.com/store/apps/details?id=" + this.getPackageName()
                    )
                )
                .startChooser();

        }

        policy.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://tictactoerobot0xgameprivacypolicy.blogspot.com/2023/07/tic-tac-toi-robot-0x-game-privacy-policy.html") // missing 'http://' will cause crashed

            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        consol.setOnClickListener {

        }




        b1.setOnClickListener {


            color = setcolour(count)

            Log.d("colorcolorcolorcolor111111", "onCreate: color ${color}")

            get = 1

            if (color % 2 == 1) {
                b1.setBackgroundResource(R.drawable.buttonbackgroundset)
                b2.setBackgroundResource(R.drawable.buttoncolour)
            }
        }
        b2.setOnClickListener {

            get = 2


            color = setcolour(count)

            Log.d("colorcolorcolorcolor2222222", "onCreate: color ${color}")

            if (color % 2 == 1) {
                b2.setBackgroundResource(R.drawable.buttonbackgroundset)
                b1.setBackgroundResource(R.drawable.buttoncolour)
            }
        }

        start.setOnClickListener {
            if (color == 1) {
                startActivity(
                    Intent(this@AskQustionActivity, MainActivity::class.java).putExtra(
                        "get",
                        get
                    )
                )
                finish()
            } else {
                Toast.makeText(this, "Plase select Player", Toast.LENGTH_SHORT).show()
            }

        }
    }

    private fun setcolour(count: Int): Int {

        var count = count

        if (count++ % 2 == 0) {
            return count
        } else {
            return count
        }

    }

    fun customExitDialog() {
        // creating custom dialog
        val dialog = Dialog(this@AskQustionActivity)

        // setting content view to dialog
        dialog.setContentView(R.layout.custom_exit_dialog)

        // getting reference of TextView
        val dialogButtonYes = dialog.findViewById(R.id.textViewYes) as TextView
        val dialogButtonNo = dialog.findViewById(R.id.textViewNo) as TextView

        // click listener for No
        dialogButtonNo.setOnClickListener {

            dialog.dismiss()
        }


        dialogButtonYes.setOnClickListener {
            dialog.dismiss()
            finishAffinity()
        }


        // show the exit dialog
        dialog.show()
    }

    override fun onBackPressed() {
        // calling the function
        customExitDialog()

    }
}