package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findViewById<Button>(R.id.button)
            .setOnClickListener({v, -> (v as Button).text = "You clicked the button"})
        setContentView(R.layout.activity_main)
    }
}