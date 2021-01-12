package com.example.myapplication

import android.content.Context
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityAboutBinding

class About : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    private val myName:Myname=Myname("Hashtag Media")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_about)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_about)
        binding.myName=myName
      /*  findViewById<Button>(R.id.bt_done).setOnClickListener {
            addNickName(it)
        }*/
        binding.btDone.setOnClickListener {
            addNickName(it)
        }
    }
    private fun addNickName(view:View){
    /*    val ed_nikname=findViewById<EditText>(R.id.ed_nikname)
        val txt_nikname=findViewById<TextView>(R.id.txt_name)
        txt_nikname.text=ed_nikname.text
        ed_nikname.visibility=View.GONE
        view.visibility=View.GONE
        txt_nikname.visibility=View.VISIBLE*/
      binding.apply {
          binding.txtName.text = binding.edNikname.text
          binding.myName?.NickName="ALI"
          invalidateAll()
          binding.edNikname.visibility = View.GONE
          binding.btDone.visibility = View.GONE
          binding.txtName.visibility = View.VISIBLE
      }
        //Hide the keyboard.
        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}
