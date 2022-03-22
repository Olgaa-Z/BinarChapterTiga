package binar.andlima.chaptertiga.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.andlima.chaptertiga.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

//        parsingSerializable()
        parsingParcelable()

    }

    fun parsingSerializable(){
        btn_serializable.setOnClickListener {
            val pindah = Intent(this, SecondActivity::class.java)
            val dataperson = Person("binar", "bianr@gmail.com")
            pindah.putExtra("ANSATU", dataperson )
            startActivity(pindah)

        }
    }

    fun parsingParcelable(){
        btn_parcelable.setOnClickListener {
//            val ee = editnama.text.toString
            val pindah = Intent(this, SecondActivity::class.java)
            val dataperson = PersonParcelable("binar dua", "binardua@gmail.com")
            pindah.putExtra("ANDDUA", dataperson)
            startActivity(pindah)
        }
    }



}