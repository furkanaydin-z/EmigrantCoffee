package com.example.emigrantcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.emigrantcoffee.databinding.FragmentDrawerHomeBinding

class DrawerHomeFragment : Fragment() {

    private var _binding : FragmentDrawerHomeBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDrawerHomeBinding.inflate(inflater,container,false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.hotbuttondrawerhome.setOnClickListener {
            findNavController().navigate(R.id.action_drawerHomeFragment2_to_recyclerFragment)
        }
        binding.coldbuttondrawerhome.setOnClickListener {
            findNavController().navigate(R.id.action_drawerHomeFragment2_to_recyclerColdFragment2)
        }
        binding.dessertbuttondrawerhome.setOnClickListener {
            findNavController().navigate(R.id.action_drawerHomeFragment2_to_recyclerDessertFragment)
        }
        binding.withoutcoffeebuttondrawerhome.setOnClickListener {
            findNavController().navigate(R.id.action_drawerHomeFragment2_to_recyclerWithOutCoffeeFragment)
        }
    }

}
