package com.md.nurkhan.navdrawertest

import android.app.ActionBar
import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.activity.OnBackPressedCallback

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SocondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SocondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_socond, container, false)
        val btn: Button = view.findViewById(R.id.btnSecond)
        btn.setOnClickListener {
            val rBtn: RadioButton = view.findViewById(R.id.rBtnSec)
            val rBtn2: RadioButton = view.findViewById(R.id.rBtn2Sec)
            val rBtn3: RadioButton = view.findViewById(R.id.rBtn3Sec)
            val rBtn4: RadioButton = view.findViewById(R.id.rBtn4Sec)
            if (rBtn3.isChecked){
                fragmentManager?.beginTransaction()?.replace(R.id.nav_container, ThreeFragment())?.commit()
            } else{
                rBtn.isChecked = false
                rBtn2.isChecked = false
                rBtn4.isChecked = false
                Toast.makeText(context, "Неправильный ответ!", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }

}