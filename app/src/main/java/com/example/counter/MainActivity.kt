package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTapCount(view: View) {
        count++

        val Findhte = findViewById(R.id.textView) as TextView
        textView.text="$count"
    }

    fun onTapDec(view: View) {
      if(count>0)
      {
          --count
          val Findhte = findViewById(R.id.textView) as TextView
          textView.text="$count"
      }
        else{
          var ad=AlertDialog.Builder(this)
          ad.setMessage("Cannot De-count")
          ad.setTitle("Counter!")
          ad.setPositiveButton("OK",null)
          ad.show()
      }

    }

    fun onTapReset(view: View) {
        count=0
        val Findhte = findViewById(R.id.textView) as TextView
        textView.text="$count"
    }
}