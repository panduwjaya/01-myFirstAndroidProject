package com.example.helloworld

//below things is widget
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.MyButton)
        val tvMyTextView2 = findViewById<TextView>(R.id.textView2)
        val tvMyTextView = findViewById<TextView>(R.id.textView1)
        var timesClicked = 0
        //fungsi dari penggunaan setOnClickListener adalah akan terjadi perubahan ketika tombol di klik,tombol pada fungsi ini berperan sebagai saklar
        btnClickMe.setOnClickListener {
            btnClickMe.text = "Click Disini"//this is button
            timesClicked = timesClicked + 1
            tvMyTextView.text = timesClicked.toString()//change number to string,each you click the number will increase
            tvMyTextView2.text = "Thanks for Visit Us"//this text will change when you click the button
            Toast.makeText(this,"You Click in "+timesClicked.toString(),Toast.LENGTH_LONG).show()//toast make a short message notification in application
        }
    }
}