package com.leonardo.trabalho02_ds151

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val team = intent.getParcelableExtra<Team>("TEAM")

        if (team != null) {
            val logo = findViewById<ImageView>(R.id.imageViewDetailLogo)
            val name = findViewById<TextView>(R.id.textViewDetailName)
            val city = findViewById<TextView>(R.id.textViewCity)
            val stadium = findViewById<TextView>(R.id.textViewStadium)
            val championships = findViewById<TextView>(R.id.textViewChampionships)

            logo.setImageResource(team.logoResId)
            name.text = team.name
            "Cidade: ${team.city}".also { city.text = it }
            "Estádio: ${team.stadium}".also { stadium.text = it }
            "Títulos: ${team.championships}".also { championships.text = it }
        }
    }
}