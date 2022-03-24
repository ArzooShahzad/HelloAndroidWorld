/**
    MainActivity is an entry point for my app. When I build and run my app,
    the system launches an instance of this Activity and loads its layout on the device.

 */
package com.example.helloandroidworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 *  This is MainActivity.kt file.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}