package com.example.companionobjectappaib

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var CMain:ConstraintLayout
    lateinit var BTN:Button
    lateinit var EDT:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CMain=findViewById(R.id.CoLay)
        BTN=findViewById(R.id.thebutton)
        EDT=findViewById(R.id.theeditText)


        BTN.setOnClickListener(object : View.OnClickListener {

            override fun onClick(p0: View?) {
                if (EDT.text.isNotBlank())
                {
                    var userinput = EDT.text?.toString()

                    when (userinput?.toLowerCase()) {
                        "day" -> {
                            val BCRD = TheBackground()
                            BCRD.DayorNight(CMain, TheBackground.day)
                            EDT.text.clear()
                        }
                        "night" -> {
                            val BCRD = TheBackground()
                            BCRD.DayorNight(CMain, TheBackground.night)
                            EDT.text.clear()
                        }
                    }
                }
                else
                {
                    Snackbar.make(CMain, "Enter Day or Night", Snackbar.LENGTH_LONG).show()
                }
            }

        })


    }
}