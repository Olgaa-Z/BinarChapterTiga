package binar.andlima.chaptertiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {

            val username = et_username.text.toString()
            val passd = et_password.text.toString()

            if (username == "admin" && passd== "12345"){
                textlogin.text= "OK"
                startActivity(Intent(this, Home::class.java))
            }else{
                textlogin.text= "Gagal Login"
            }
        }


    }
}