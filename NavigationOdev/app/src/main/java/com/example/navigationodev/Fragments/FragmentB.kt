package com.example.navigationodev.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.R
import com.example.navigationodev.databinding.FragmentBBinding
import com.example.navigationodev.databinding.FragmentMainBinding


class FragmentB : Fragment()
{
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBBinding.inflate(inflater,container,false)
        binding.buttonBToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.B_to_Y)
        }
        return binding.root
    }

}