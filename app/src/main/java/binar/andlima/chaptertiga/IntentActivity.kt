package binar.andlima.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        textkirim.setOnClickListener {
            val data = textintent.text.toString()
            val intdata = Intent(this, HalamanDua::class.java)
            intdata.putExtra("dataintent",data)
            startActivity(intdata)
        }

//        Bundle

        bundle_btn.setOnClickListener {
            val data = textintent.text.toString()
            val data2 = "data bundle dua example"


            val intent = Intent(this, HalamanDua::class.java)

            val bundle = Bundle()
            bundle.putString("databundle", data)
            bundle.putString("databundledua",data2)
            intent.putExtras(bundle)
            startActivity(intent)

        }




    }
}