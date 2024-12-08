package com.example.kokom.ui.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kokom.R
import com.example.kokom.data.model.SubjectModel
import com.example.kokom.ui.activities.SubjectDetailActivity
import com.example.kokom.ui.adapters.SubjectAdapter
import com.example.kokom.ui.utils.CommonUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class SubjectFragment(val sort: Int) : Fragment() {

    private lateinit var subjectAdapter: SubjectAdapter

    companion object {
        const val INDEX = 0
        const val TITLE = 1
        const val DATE = 2
    }
    private var subjectList: ArrayList<SubjectModel>? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tab_previous_subject, container, false)
        recyclerView = view.findViewById(R.id.recyclerViewPreviousMatches)

        // Create a Gson instance
        val gson = Gson()


        // Define the type for the list of Person objects
        val listType = object : TypeToken<List<SubjectModel?>?>() {}.type


        // Parse the JSON array into a list of Person objects
        subjectList = gson.fromJson(CommonUtils.DATA, listType)
        when (sort){
            INDEX -> subjectList?.sortWith { p1: SubjectModel, p2: SubjectModel ->
                p2.index.compareTo(p1.index)
            }
            TITLE -> subjectList?.sortWith { p1: SubjectModel, p2: SubjectModel ->
                p2.title.compareTo(p1.title)
            }
            DATE -> subjectList?.sortWith { p1: SubjectModel, p2: SubjectModel ->
                p2.date.compareTo(p1.date)
            }
        }
        // Set up RecyclerView with adapter
        subjectAdapter = SubjectAdapter(
            requireContext(), subjectList!!,
            ) { subject -> showSubjectDetails(subject) }
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.adapter = subjectAdapter
        return view
    }

    private fun showSubjectDetails(subjectModel: SubjectModel) {
        val intent = Intent(activity, SubjectDetailActivity::class.java)
        intent.putExtra("Title", subjectModel.title)
        intent.putExtra("Desc", subjectModel.description)
        intent.putExtra("Date", subjectModel.date)
        intent.putExtra("Index", subjectModel.index)
        startForResult.launch(intent)
    }

    // Define the launcher
    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            val index = data?.getIntExtra("result_key", 0)
            val copyList = subjectList?.let { ArrayList(it) }
            if (copyList != null) {
                for (item in copyList) {
                    if (item.index == index) {
                        subjectList?.remove(item)
                    }
                }
            }
            subjectAdapter.notifyDataSetChanged()
        }
    }

}