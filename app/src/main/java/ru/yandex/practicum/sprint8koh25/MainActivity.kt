package ru.yandex.practicum.sprint8koh25

import android.app.ComponentCaller
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding
import java.util.Date

class MainActivity : AppCompatActivity() {

    var a = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val container = LinearLayout(this)
        container.addView(
            ImageView(this).apply {
                setPadding(16)

            }
        )

        findViewById<Button>(R.id.btn).setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java).apply {
                    putExtra("key", "value")
                }
            )
        }

        val f = (1..1_000_000).map {
            val date = Date()
            date.time
        }

        Log.d("SPRINT_8", "$this onCreate ${f.hashCode()}")


    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d("SPRINT_8", "$this onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SPRINT_8", "$this onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.d("SPRINT_8", "$this onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SPRINT_8", "$this onStop")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("SPRINT_8", "$this onDestroy")
    }


}