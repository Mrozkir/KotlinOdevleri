package com.example.navigationodev.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationodev.R
import com.example.navigationodev.databinding.FragmentMainBinding


class MainFragment : Fragment()
{
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(inflater,container,false)
        binding.buttonA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Main_to_A)

        }
        binding.buttonx.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Main_to_X)
        }
        return binding.root
    }
}