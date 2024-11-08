package com.leonardo.trabalho02_ds151

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class TeamAdapter(
    private val teams: List<Team>,
    private val context: Context
): RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    inner class TeamViewHolder(itemView: View): ViewHolder(itemView){
        val teamName = itemView.findViewById<TextView>(R.id.teamName)
        val teamImage = itemView.findViewById<ImageView>(R.id.teamImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return TeamViewHolder(view)
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team = teams[position]
        holder.teamImage.setImageResource(team.image)
        holder.teamName.text = team.name
    }
}