package com.md.nurkhan.navdrawertest

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WinsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WinsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_wins, container, false)
//        val btn: Button = view.findViewById(R.id.btn)
//        btn.setOnClickListener {
        setHasOptionsMenu(true);
//
//        }
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu);
//        val method = menu.findItem(R.id.shareButton)
//        method.isVisible = true //if want to show set true
        super.onCreateOptionsMenu(menu, inflater)
    }

}