package com.leonardo.trabalho02_ds151

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TeamAdapter(
    private val teamList: List<Team>,
    private val onItemClicked: (Team) -> Unit
) : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logo: ImageView = itemView.findViewById<ImageView>(R.id.imageViewLogo)
        val name: TextView = itemView.findViewById<TextView>(R.id.textViewName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return TeamViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team = teamList[position]
        holder.logo.setImageResource(team.logoResId)
        holder.name.text = team.name
        holder.itemView.setOnClickListener { onItemClicked(team) }
    }

    override fun getItemCount() = teamList.size
}