package binar.andlima.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lifecycle.*

class ActivityLifecycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        textlife.text = "OnCreate"
    }

    override fun onStart() {
        super.onStart()
        textlife.append("\n onStart")
    }

    override fun onResume() {
        super.onResume()
        textlife.append("\n onResume")
    }

    override fun onPause() {
        super.onPause()
        textlife.append("\n onPause")
    }


    override fun onStop() {
        super.onStop()
        textlife.append("\n onStop")
    }
}