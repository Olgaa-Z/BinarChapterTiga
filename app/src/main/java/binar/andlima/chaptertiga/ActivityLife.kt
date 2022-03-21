package binar.andlima.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_life.*

class ActivityLife : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life)

        textlifecycle.text= "OnCreate"
    }

    override fun onStart() {
        super.onStart()
        textlifecycle.append("\n onStart")
    }

    override fun onResume() {
        super.onResume()
        textlifecycle.append("\n onResume")
    }

    override fun onPause() {
        super.onPause()
        textlifecycle.append("\n onPause")
    }

    override fun onStop() {
        super.onStop()
        textlifecycle.append("\n onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textlifecycle.append("\n onDestroy")
    }


}