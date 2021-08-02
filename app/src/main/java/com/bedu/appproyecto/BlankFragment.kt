package com.bedu.appproyecto

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Frag","OnAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("Frag","OnActivityCreated")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Frag","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Frag","OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Frag","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Frag","OnDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("Frag","OnDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Frag","OnDetach")
    }

}