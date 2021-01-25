package com.example.prayercounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //counter number for button clicks
    private var count = 0
    private var count1 = 0
    private var count2 = 0
    var limit = 33
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//main acitivity
    fun onTap(view: View) {
        subhanallah()
    val textView3 = findViewById(R.id.textView3) as TextView
        val textView2 = findViewById(R.id.textView2) as TextView
        if (count > limit){
            textView3.text = "0"
            textView2.text = "Elhamdulilah"
            elhamdulillah()
            if (count1 > limit){
                textView3.text = "0"
                textView2.text = "Allahu Akbar"
                allahuekber()
                if (count2 > limit) {
                    textView3.text = "0"
                    textView2.text = "Make Dua"
                }
            }
        }
    }
    //subhanallah
    private fun subhanallah() {
        //increment count
        count++
        //locate and find textview - textView2, and update the label
        val textView3 = findViewById(R.id.textView3) as TextView
        val textView2 = findViewById(R.id.textView2) as TextView
        val textView = findViewById(R.id.textView) as TextView
        textView3.text = "$count"
        textView2.text = "Subhanallah"
        textView.text = "سبحان الله"
    }
    //elhamdullilah
    private fun elhamdulillah(){
        //increment count
        count1++
        //locate and find textview - textView2, and update the label
        val textView3 = findViewById(R.id.textView3) as TextView
        val textView2 = findViewById(R.id.textView2) as TextView
        val textView = findViewById(R.id.textView) as TextView
        textView3.text = "$count1"
        textView2.text = "Elhamdulilah"
        textView.text = "ٱلْحَمْدُ لِلّٰهِ"
    }
    //allahuekber
    private fun allahuekber(){
        //increment count
        count2++
        //locate and find textview - textView2, and update the label
        val textView3 = findViewById(R.id.textView3) as TextView
        val textView2 = findViewById(R.id.textView2) as TextView
        val textView = findViewById(R.id.textView) as TextView
        textView3.text = "$count2"
        textView2.text = "Allahu Akbar"
        textView.text = "الله أكبر"
    }

}