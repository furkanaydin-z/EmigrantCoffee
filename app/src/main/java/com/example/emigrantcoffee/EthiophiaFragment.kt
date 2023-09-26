package com.example.emigrantcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.emigrantcoffee.databinding.FragmentEthiophiaBinding


class EthiophiaFragment : Fragment() {

    private var _binding: FragmentEthiophiaBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         _binding = FragmentEthiophiaBinding.inflate(inflater,container,false)
        return _binding!!.root
    }

        }
