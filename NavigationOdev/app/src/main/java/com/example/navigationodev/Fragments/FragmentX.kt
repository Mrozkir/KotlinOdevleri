package com.example.navigationodev.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.R
import com.example.navigationodev.databinding.FragmentXBinding


class FragmentX : Fragment() {
    private lateinit var binding: FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentXBinding.inflate(inflater,container,false)
        binding.buttonY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.X_to_Y)
        }
        return binding.root
    }
}