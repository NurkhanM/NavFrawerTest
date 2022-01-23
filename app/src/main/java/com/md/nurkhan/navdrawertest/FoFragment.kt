package com.md.nurkhan.navdrawertest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fo, container, false)
        val btn: Button = view.findViewById(R.id.btnFo)
        btn.setOnClickListener {
            val rBtn: RadioButton = view.findViewById(R.id.rBtnFo)
            val rBtn2: RadioButton = view.findViewById(R.id.rBtn2Fo)
            val rBtn3: RadioButton = view.findViewById(R.id.rBtn3Fo)
            val rBtn4: RadioButton = view.findViewById(R.id.rBtn4Fo)
            if (rBtn4.isChecked){
                fragmentManager?.beginTransaction()?.replace(R.id.nav_container, WinsFragment())?.commit()
            } else{
                rBtn.isChecked = false
                rBtn3.isChecked = false
                rBtn2.isChecked = false
                Toast.makeText(context, "Неправильный ответ!", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }


}