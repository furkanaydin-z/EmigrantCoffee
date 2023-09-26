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
 * Use the [RecyclerWithOutCoffeeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecyclerWithOutCoffeeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapterwithoutcoffee : MyAdapter
    private lateinit var recyclerwithoutcoffee : RecyclerView
    private lateinit var listwithoutcoffee : ArrayList<hotdata>

    lateinit var imagewithoutcoffee : Array<Int>
    lateinit var textwithoutcoffee : Array<String>

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
        return inflater.inflate(R.layout.fragment_recycler_with_out_coffee, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecyclerWithOutCoffeeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecyclerWithOutCoffeeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInizilationWithoutCoffee()
        var layoutManagerWithOutCoffee = LinearLayoutManager(context)
        recyclerwithoutcoffee = view.findViewById(R.id.recyclerviewwithoutCoffee)
        recyclerwithoutcoffee.layoutManager = layoutManagerWithOutCoffee
        recyclerwithoutcoffee.setHasFixedSize(true)
        adapterwithoutcoffee = MyAdapter(listwithoutcoffee)
        recyclerwithoutcoffee.adapter = adapterwithoutcoffee

    }

    private fun dataInizilationWithoutCoffee(){
        listwithoutcoffee = arrayListOf<hotdata>()

        imagewithoutcoffee = arrayOf(

            R.drawable.pinocolada,
            R.drawable.smoothie,
            R.drawable.apple,
            R.drawable.oreomilk,
            R.drawable.ahududumilk,
            R.drawable.sakiz,
            R.drawable.lemonade,
            R.drawable.ahududulemonade,
            R.drawable.cucumber,
            R.drawable.mainpagewithoutcoffee,
            R.drawable.greentealemon,
            R.drawable.mango,
            R.drawable.malinacay,

        )
        textwithoutcoffee = arrayOf(

            getString(R.string.pinocolado),
            getString(R.string.muzfıstık),
            getString(R.string.applepie),
            getString(R.string.oreo),
            getString(R.string.ahududu),
            getString(R.string.bubblegum),
            getString(R.string.limonata),
            getString(R.string.malina),
            getString(R.string.cucumber),
            getString(R.string.juice),
            getString(R.string.cay1),
            getString(R.string.cay2),
            getString(R.string.cay3)
        )

        for (w in imagewithoutcoffee.indices) {
            val withoutcoffee = hotdata(imagewithoutcoffee[w], textwithoutcoffee[w])
            listwithoutcoffee.add(withoutcoffee)
        }
    }
}