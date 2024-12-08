package com.example.kokom.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kokom.R
import com.example.kokom.data.model.SubjectModel

class SubjectAdapter(
    private var context: Context,
    private var subjectList: ArrayList<SubjectModel>,
    private val onItemClick: (SubjectModel) -> Unit
) : RecyclerView.Adapter<SubjectAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvIndex: TextView = view.findViewById(R.id.tvIndex)
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val tvDate: TextView = view.findViewById(R.id.tvDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_subject, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val subjectModel = subjectList[position]

        holder.tvIndex.text = subjectModel.index.toString()
        holder.tvTitle.text = subjectModel.title
        holder.tvDate.text = subjectModel.date

        // Set click listeners
        holder.itemView.setOnClickListener {
            onItemClick(subjectModel)
        }
    }

    override fun getItemCount(): Int {
        return subjectList.size
    }

    fun updateSubjectList(newSubjectList: ArrayList<SubjectModel>) {
        subjectList.clear()
        subjectList.addAll(newSubjectList)
        notifyDataSetChanged()
    }
}