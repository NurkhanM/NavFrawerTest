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
 * Use the [ThreeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThreeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        val btn: Button = view.findViewById(R.id.btnThree)
        btn.setOnClickListener {
            val rBtn: RadioButton = view.findViewById(R.id.rBtnThree)
            val rBtn2: RadioButton = view.findViewById(R.id.rBtn2Three)
            val rBtn3: RadioButton = view.findViewById(R.id.rBtn3Three)
            val rBtn4: RadioButton = view.findViewById(R.id.rBtn4Three)
            if (rBtn.isChecked){
                fragmentManager?.beginTransaction()?.replace(R.id.nav_container, FoFragment())?.commit()
            } else{
                rBtn2.isChecked = false
                rBtn3.isChecked = false
                rBtn4.isChecked = false
                Toast.makeText(context, "Неправильный ответ!", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }

}