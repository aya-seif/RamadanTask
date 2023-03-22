package com.example.ramadanwelcomingscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewTreeObserver
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {

    private lateinit var welcomeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        welcomeText = findViewById(R.id.welcome_text)
//        welcomeText.viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
//            override fun onGlobalLayout() {
//                // Start the text animation when the view is laid out
//                startTextAnimation()
//                // Remove the OnGlobalLayoutListener to prevent multiple calls to this method
//                welcomeText.viewTreeObserver.removeOnGlobalLayoutListener(this)
//            }
//        })

    }

    private fun startTextAnimation() {
        // Get a reference to the MotionLayout
//        val motionLayout = findViewById<MotionLayout>(R.id.motion_layout)
        // Start the animation
//        motionLayout.transitionToEnd()
    }
}