package com.leonardo.trabalho02_ds151

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewTeams: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        recyclerViewTeams = findViewById(R.id.mainList)
        recyclerViewTeams.adapter = TeamAdapter(this.createTeams(), this)
        recyclerViewTeams.layoutManager = LinearLayoutManager(this)

    }

    private fun createTeams(): List<Team>{
        return listOf(
            Team(R.drawable.sf49, "São Francisco 49ers","NFC Oeste", 5, "Time que sempre promete e não entrega nada"),
            Team(R.drawable.patriots, "New England Patriots","AFC Leste", 6, "Time do ex marido da Gisele"),
            Team(R.drawable.kansas, "Kansas City Chiefs", "AFC Oeste", 4,"BABABABABABBABABA"),
            Team(R.drawable.detroid, "Detrid Lions", "NFC Norte", 0,"BABABABABABBABABA"),
            Team(R.drawable.eagles, "Philadelfia Eagles", "NFC Leste", 0,"BABABABABABBABABA"),
            Team(R.drawable.saints, "New OrleansSaints", "NFC Sul", 0,"BABABABABABBABABA")

        )
    }

    fun goNextActivity(view: View){
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}