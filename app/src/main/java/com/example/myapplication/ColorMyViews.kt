package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_color_my_views.*

class ColorMyViews : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_my_views)
        setListeners()
    }
    private fun setListeners(){
        val clickableViews: List<View> =
                      listOf(txt_one_box,bt_tow,txt_three,txt_foure,txt_five)
        for (item in clickableViews)
            item.setOnClickListener{
                makeColored(it)
            }
    }
    private fun makeColored(view: View){
        when(view.id){
            R.id.txt_one_box->view.setBackgroundColor(Color.DKGRAY)
            R.id.bt_tow->view.setBackgroundColor(Color.GRAY)

            R.id.txt_three->view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.txt_foure->view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.txt_five->view.setBackgroundResource(android.R.color.holo_green_light)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
