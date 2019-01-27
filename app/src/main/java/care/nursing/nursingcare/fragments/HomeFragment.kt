package care.nursing.nursingcare.fragments

import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import care.nursing.nursingcare.adapters.NextPatients

import care.nursing.nursingcare.DataBaseFake

import care.nursing.nursingcare.R

class HomeFragment : Fragment() {

    private var recyclerView : RecyclerView? = null // donde vamos a mostrar la data
    private var adapter : RecyclerView.Adapter<*>? = null // adaptador de tipo RecyclerVIEW
    private var arrayDatos = arrayListOf<DataBaseFake.CardViewInformation>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataBase = DataBaseFake()

        var i : Int = 0
        repeat(5){
            val item = DataBaseFake.CardViewInformation
            item.date = dataBase.dates[i]
            item.name = dataBase.names[i]
            item.direction = dataBase.directions[i]
            item.schedule = dataBase.schedules[i]
            item.photo = dataBase.photos[i]
            arrayDatos.add(item)
            i++
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var mLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false) // este elemento une el adpter que contiene los cardview ya con infomacion y el recyclerview
        recyclerView!!.layoutManager = mLayoutManager
        adapter = NextPatients(arrayDatos)
        recyclerView!!.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.lv_next_patients)
        return view
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {

    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

}
