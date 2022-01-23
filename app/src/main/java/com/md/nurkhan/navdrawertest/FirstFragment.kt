package com.md.nurkhan.navdrawertest

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val btn: Button = view.findViewById(R.id.btn)
        btn.setOnClickListener {
            val rBtn: RadioButton  = view.findViewById(R.id.rBtn)
            val rBtn2: RadioButton  = view.findViewById(R.id.rBtn2)
            val rBtn3: RadioButton  = view.findViewById(R.id.rBtn3)
            val rBtn4: RadioButton  = view.findViewById(R.id.rBtn4)
            if (rBtn2.isChecked){
                fragmentManager?.beginTransaction()?.replace(R.id.nav_container, SocondFragment())?.commit()
            } else{
                rBtn.isChecked = false
                rBtn3.isChecked = false
                rBtn4.isChecked = false
                Toast.makeText(context, "Неправильный ответ!", Toast.LENGTH_SHORT).show()
            }
        }
        return view



    }



}