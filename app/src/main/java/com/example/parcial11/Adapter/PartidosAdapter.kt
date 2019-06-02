package com.example.parcial11.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcial11.Database.Partido
import com.example.parcial11.R
import kotlinx.android.synthetic.main.recyclerview_item.view.*
import org.w3c.dom.Text

class PartidosAdapter internal constructor(context : Context): RecyclerView.Adapter<PartidosAdapter.PartidosViewHolder>(){
    private val inflater : LayoutInflater = LayoutInflater.from(context)
    private var partidos = emptyList<Partido>()


    class PartidosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val EquipoAScore : TextView = itemView.findViewById(R.id.tv_ScoreTeamA)
        val EquipoBScore : TextView = itemView.findViewById(R.id.tv_ScoreTeamB)
        val NombreEquipoA : TextView = itemView.findViewById(R.id.tv_itemNombreA)
        val NombreEquipoB : TextView = itemView.findViewById(R.id.tv_itemNombreB)
        val Fecha : TextView = itemView.findViewById(R.id.tv_ItemFecha)
        val ganador: TextView = itemView.findViewById(R.id.tv_itemGanador)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartidosAdapter.PartidosViewHolder {
        val itemView = inflater.inflate(R.layout.recyclerview_item, parent, false)
        return PartidosViewHolder(itemView)
    }

    override fun getItemCount(): Int = partidos.size

    override fun onBindViewHolder(holder: PartidosAdapter.PartidosViewHolder, position: Int) {
        val current = partidos[position]
        holder.EquipoAScore.text = current.ScoreA.toString()
        holder.EquipoBScore.text = current.ScoreB.toString()
        holder.NombreEquipoA.text = current.EquipoA
        holder.NombreEquipoB.text = current.EquipoB
        holder.Fecha.text = current.fecha
        holder.ganador.text = current.Ganador
    }

    internal fun setPartidos(partidos: List<Partido>) {
        this.partidos = partidos
        notifyDataSetChanged()
    }


}