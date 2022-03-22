package binar.andlima.chaptertiga.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.andlima.chaptertiga.R
import kotlinx.android.synthetic.main.activity_halaman_utama.*

class HalamanUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_utama)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, FirstFragment())
                .commit()
        }

        first_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, FirstFragment())
                    .commit()
            }
        }

        second_btn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment_container, SecondFragment())
                    .commit()
            }
        }
    }
}