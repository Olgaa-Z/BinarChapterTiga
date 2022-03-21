package binar.andlima.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_dua.*

class HalamanDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)

        val data = intent.getStringExtra("dataintent")
        intenthasil.text = data

//        get data bundle
        val bund = intent.extras
        bundlehasil.setText(bund?.getString("databundle"))

    }
}