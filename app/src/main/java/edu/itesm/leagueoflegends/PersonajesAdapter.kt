package edu.itesm.leagueoflegends

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonajesAdapter(private val personaje : List<personajes>) : RecyclerView.Adapter<PersonajesAdapter.PersonajesViewHolder>(){

    inner class PersonajesViewHolder(v: View) : RecyclerView.ViewHolder(v){
        var foto = v.findViewById<ImageView>(R.id.foto)
        var nombre = v.findViewById<TextView>(R.id.nombre)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val personajes_renglon = inflater.inflate(R.layout.personajes_renglon, parent, false)
        return PersonajesViewHolder(personajes_renglon)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val dato = personaje[position]
        holder.foto.setImageResource(dato.imagen)
        holder.nombre.text = dato.nombre

    }

    override fun getItemCount(): Int {
        return personaje.size

    }
}