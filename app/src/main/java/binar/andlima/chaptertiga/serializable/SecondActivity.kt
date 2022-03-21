package binar.andlima.chaptertiga.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import binar.andlima.chaptertiga.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val dataperson = intent.getSerializableExtra("ANSATU") as Person

//        txt_serializable.text = dataperson.toString()
//        txt_serializabledua.text = dataperson.name

//        get data Parcelable
        val dataparcelable = intent.getParcelableExtra("ANDDUA") as PersonParcelable?
        txt_parcelable.text = dataparcelable.toString()

    }
}