package com.example.myapplication

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import java.util.*

import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    //var dicimage:ImageView?=null
   lateinit var dicimage:ImageView
    lateinit var next:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.btConstract.setOnClickListener {
            val intentcolor=Intent(this,ColorMyViews::class.java).apply {
                putExtra("parameters",5)

            }
            startActivity(intentcolor)
        }

        dicimage=findViewById(R.id.img_dic)
        next=findViewById(R.id.bt_next)
        var mybutton:Button=findViewById(R.id.bt_rool)
        mybutton.setOnClickListener{
            roolDic()
            //Toast.makeText(this,"Hiiii",Toast.LENGTH_SHORT).show()
        }
        next.setOnClickListener {
            val inttent=Intent(this,About::class.java).apply {
                putExtra("hamed",4)

            }
            startActivity(inttent)

        }

    }

    private fun roolDic() {
        var mytext:TextView=findViewById(R.id.txt_cont)
        val randomint= Random().nextInt(6)+1
        val drawableResource=when(randomint){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        dicimage.setImageResource(drawableResource)


        mytext.text=randomint.toString()



    }
}
