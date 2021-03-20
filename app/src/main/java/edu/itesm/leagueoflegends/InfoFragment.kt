package edu.itesm.leagueoflegends

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_info.*
import kotlinx.android.synthetic.main.fragment_info.foto_renglon
import kotlinx.android.synthetic.main.fragment_info.nombre_renglon
import kotlinx.android.synthetic.main.fragment_personajes.*
import kotlinx.android.synthetic.main.personajes_renglon.*

class InfoFragment : Fragment() {

    private val args by navArgs<InfoFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        foto_renglon.setImageResource(args.campeon.imagen)
        nombre_renglon.text = args.campeon.nombre
        informacion_renglon.text = args.campeon.informacion

        val text = args.campeon.secreto
        val duration = Toast.LENGTH_LONG

        val toast = Toast.makeText(context, text, duration)
        toast.show()
    }
}