package com.example.vistaweb

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class VistaFragment: Fragment() {
    var webview: WebView? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.vista_fragment, container, false)

        webview = view.findViewById<View>(R.id.wb_web) as WebView

        return view
    }

    fun verPagina(url: String?) {
        webview?.setWebViewClient(WebViewClient())
        if (url != null) {
            webview?.loadUrl(url)
        }
    }
}