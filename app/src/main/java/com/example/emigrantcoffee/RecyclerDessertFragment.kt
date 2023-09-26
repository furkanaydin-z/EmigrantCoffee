package com.example.emigrantcoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RecyclerDessertFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecyclerDessertFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapterdessert : MyAdapter
    private lateinit var recyclerviewdessert: RecyclerView
    private lateinit var dessertlist : ArrayList<hotdata>

    lateinit var dessertimage : Array<Int>
    lateinit var dessertext : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_dessert, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecyclerDessertFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecyclerDessertFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInizilationDessert()
        var layoutManagerDessert = LinearLayoutManager(context)
        recyclerviewdessert = view.findViewById(R.id.recyclerviewDessert)
        recyclerviewdessert.layoutManager = layoutManagerDessert
        recyclerviewdessert.setHasFixedSize(true)
        adapterdessert = MyAdapter(dessertlist)
        recyclerviewdessert.adapter = adapterdessert
    }


    private fun dataInizilationDessert(){

        dessertlist = arrayListOf<hotdata>()

        dessertimage = arrayOf(

            R.drawable.melenga,
            R.drawable.medovik,
            R.drawable.threechocolate,
            R.drawable.strawberrymint,
            R.drawable.kitkat,
            R.drawable.truf,
            R.drawable.rawmatcha,
            R.drawable.somon,
            R.drawable.chicken,
            R.drawable.wrap
        )

        dessertext = arrayOf(
            getString(R.string.melenga),
            getString(R.string.medovik),
            getString(R.string.threechocolate),
            getString(R.string.strawberrymint),
            getString(R.string.kitkat),
            getString(R.string.truf),
            getString(R.string.raw),
            getString(R.string.somon),
            getString(R.string.chicken),
            getString(R.string.tortilla),

        )

        for (d in dessertimage.indices){
            val dessert = hotdata(dessertimage[d], dessertext[d])
            dessertlist.add(dessert)
        }

    }


}