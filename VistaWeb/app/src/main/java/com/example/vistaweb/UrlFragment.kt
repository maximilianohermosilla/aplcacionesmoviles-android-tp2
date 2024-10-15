package com.example.vistaweb

import android.app.Activity
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText




class UrlFragment: Fragment() {
    var activityCallback: MiListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.url_fragment, container, false)

        var btn: Button = view.findViewById(R.id.btn_ir);

        btn.setOnClickListener{
            buttonClicked(view);
        }

        return view
    }

    interface MiListener {
        fun onButtonClick(text: String?)
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        try {
            activityCallback = activity as MiListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                activity.toString()
                        + " debe implementar MiListener"
            )
        }
    }


    fun buttonClicked(view: View) {
        var edit: EditText = view.findViewById(R.id.e_url);
        var editTexto = edit.getText().toString();
        activityCallback?.onButtonClick(editTexto);
    }
}