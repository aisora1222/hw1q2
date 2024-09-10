package com.example.hw1q2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw1q2.ui.theme.Hw1q2Theme
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val buttonShowText = findViewById<Button>(R.id.button_show_text)
        val textHelloWorld = findViewById<TextView>(R.id.text_hello_world)

        buttonShowText.setOnClickListener {
            textHelloWorld.visibility = View.VISIBLE
            buttonShowText.visibility = View.INVISIBLE
        }
    }

}


