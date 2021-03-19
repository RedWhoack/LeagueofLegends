package edu.itesm.leagueoflegends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        Handler().postDelayed({
            val intento = Intent(this, MainActivity::class.java)
            startActivity(intento)
            finish()
        },5000 )
    }
}