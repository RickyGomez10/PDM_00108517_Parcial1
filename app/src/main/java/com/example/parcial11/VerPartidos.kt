package com.example.parcial11

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parcial11.Fragments.ListaPartidosFragment

class VerPartidos : AppCompatActivity(), ListaPartidosFragment.OnFragmentInteractionListener {
    val listapartidos = ListaPartidosFragment()

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_partidos)

        supportFragmentManager.beginTransaction().replace(R.id.ContenedorFragments, listapartidos).commit()


    }
}
