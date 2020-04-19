package com.everton.caricaturakotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CaricaturaAdapter(val list: List<Caricatura>, val context:Context) : RecyclerView.Adapter<CaricaturaAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_caricatura,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val caricaturas = list[position]
        holder.imagem.setImageResource(caricaturas.image)
        holder.nome.text = caricaturas.name
        holder.idade.text = caricaturas.age
        holder.profissao.text = caricaturas.profession
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imagem: ImageView = itemView.findViewById(R.id.imagem)
        val nome: TextView = itemView.findViewById(R.id.nome)
        val idade: TextView = itemView.findViewById(R.id.idade)
        val profissao: TextView = itemView.findViewById(R.id.profissao)
    }
}