package com.leonardo.trabalho02_ds151

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewTeams)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val teamList = getTeamList()
        val adapter = TeamAdapter(teamList) { team ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("TEAM", team)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }

    private fun getTeamList(): List<Team> {
        return listOf(
            Team("New England Patriots", "Foxborough, MA", "Gillette Stadium", 6, R.drawable.patriots),
            Team("Dallas Cowboys", "Arlington, TX", "AT&T Stadium", 5, R.drawable.cowboys),
            Team("Pittsburgh Steelers", "Pittsburgh, PA", "Heinz Field", 6, R.drawable.steelers),
            Team("Green Bay Packers", "Green Bay, WI", "Lambeau Field", 4, R.drawable.packers),
            Team("San Francisco 49ers", "Santa Clara, CA", "Levi's Stadium", 5, R.drawable.forty_niners),
            Team("New York Giants", "East Rutherford, NJ", "MetLife Stadium", 4, R.drawable.giants)
        )
    }
}