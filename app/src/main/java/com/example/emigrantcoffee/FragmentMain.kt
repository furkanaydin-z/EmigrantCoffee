package com.example.emigrantcoffee

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.emigrantcoffee.databinding.FragmentMainBinding

class FragmentMain: Fragment() {
    private var _binding : FragmentMainBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return _binding!!.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.hotbutton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_recyclerFragment)
        }
        binding.coldbutton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_recyclerColdFragment2)
        }
        binding.dessertbutton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_recyclerDessertFragment)
        }
        binding.withoutcoffeebutton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMain_to_recyclerWithOutCoffeeFragment)
        }
    }
}