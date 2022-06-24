package jp.techacademy.yuki.sakamaki.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import java.time.LocalDateTime
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            val dt = LocalDateTime.now()
            if(dt >= 2:00 and dt <= 9:59){
                textView.text = "おはよう"
            }else if(dt >= 10:00 and dt <= 17:59){
                textView.text = "こんにちは"
            }else if(dt >= 18:00 and dt <= 1:59){
                textView.text = "こんばんは"
            }

                    //editText.text.toString()
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            13, 0, true)
        timePickerDialog.show()
    }
}