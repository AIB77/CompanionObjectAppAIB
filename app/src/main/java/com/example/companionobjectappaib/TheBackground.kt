package com.example.companionobjectappaib

import android.view.View

class TheBackground {

    companion object{

        val night = 0
        val day = 1

    }

    fun DayorNight(layout: View, day:Int){

        when (day)
        {
            0->{layout.setBackgroundResource(R.drawable.night)}
            1->{layout.setBackgroundResource(R.drawable.day)}
        }

    }
}