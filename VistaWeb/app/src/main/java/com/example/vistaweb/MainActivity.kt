package com.example.vistaweb

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.vistaweb.UrlFragment.MiListener


class MainActivity : FragmentActivity(), MiListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onButtonClick(text: String?) {
        val vistaFragment =
            getSupportFragmentManager().findFragmentById(R.id.vista_fragment) as VistaFragment

        vistaFragment.verPagina(text)
    }
}