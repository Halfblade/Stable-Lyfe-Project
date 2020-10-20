package com.example.stablelyfe.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stablelyfe.R

class SpecialNotesFragment : Fragment() {

    companion object {
        fun newInstance() = SpecialNotesFragment()
    }

    private lateinit var viewModel: SpecialNotesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.special_notes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SpecialNotesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}