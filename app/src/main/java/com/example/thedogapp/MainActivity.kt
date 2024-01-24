package com.example.thedogapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.thedogapp.presentation.TheDogViewModel

class MainActivity : AppCompatActivity() {

    private val savedButton: Button by lazy { findViewById(R.id.floatingActionButton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        savedButton.setOnClickListener {
            Log.d("SAVED_BTN", "Saved Button was clicked.")
        }

//        val theDogViewModel = hiltViewModel<TheDogViewModel>()

//        delete this automatic code
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
    }
}