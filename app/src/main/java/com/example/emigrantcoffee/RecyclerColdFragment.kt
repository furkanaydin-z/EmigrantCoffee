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
 * Use the [RecyclerColdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecyclerColdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter2: MyAdapter
    private lateinit var recyclerviewcold: RecyclerView
    private lateinit var coffeelist2: ArrayList<hotdata>

    lateinit var coffeimage2: Array<Int>
    lateinit var textcoffee2: Array<String>

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
        return inflater.inflate(R.layout.fragment_recycler_cold, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecyclerColdFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecyclerColdFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitializecold()
        var layoutManagercold = LinearLayoutManager(context)
        recyclerviewcold = view.findViewById(R.id.RecyvlerViewCold)
        recyclerviewcold.layoutManager = layoutManagercold
        recyclerviewcold.setHasFixedSize(true)
        adapter2 = MyAdapter(coffeelist2)
        recyclerviewcold.adapter = adapter2
    }


    private fun dataInitializecold() {
        coffeelist2 = arrayListOf<hotdata>()

        coffeimage2 = arrayOf(

            R.drawable.icelatte,
            R.drawable.espressotonic,
            R.drawable.matcha,
            R.drawable.bumble,
            R.drawable.oreolatte,
            R.drawable.honeylatte,
            R.drawable.citruslatte,
            R.drawable.icemocha,
            R.drawable.icemocha,
            R.drawable.karamellisouklatte,
            R.drawable.karamellisouklatte,
            R.drawable.karamellisouklatte,

        )



        textcoffee2 = arrayOf(
            getString(R.string.iclatte),
            getString(R.string.tonic),
            getString(R.string.matchatonic),
            getString(R.string.bumble),
            getString(R.string.oreoice),
            getString(R.string.honetlate),
            getString(R.string.citrus),
            getString(R.string.mok),
            getString(R.string.icewhite),
            getString(R.string.qaramel),
            getString(R.string.popcornlatte),
            getString(R.string.coconutlatte),

        )

        for (x in coffeimage2.indices) {
            val last = hotdata(coffeimage2[x], textcoffee2[x])
            coffeelist2.add(last)
        }
    }
}