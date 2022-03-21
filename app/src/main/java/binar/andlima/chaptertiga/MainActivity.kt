package binar.andlima.chaptertiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val angka1  = 70
//        val angka2= 89
//        val hasil = angka1 + angka2
//
//        text1.text = hasil.toString()

        btnproses.setOnClickListener {
            val angka1 = angkasatu.text.toString()
            val angka2 = angkadua.text.toString()

            val jumlah= angka1.toInt()+ angka2.toInt()
            texthasil.text = "Penjumlahan $angka1 + $angka2 = $jumlah "

        }

        val nilai = 90
        if(nilai > 60 && nilai <= 100){
            "lulus"
        }else{
            "tidak lulus"
        }


    }


}

