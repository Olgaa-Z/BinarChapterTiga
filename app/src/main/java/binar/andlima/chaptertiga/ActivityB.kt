package binar.andlima.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val datanama = intent.getStringExtra("nama")
        val datadua = intent.getStringExtra("datadua")

        nama.text = datanama

//        Bundle

        val bund = intent.extras
        nama.setText(bund?.getString("datanama"))


    }
}