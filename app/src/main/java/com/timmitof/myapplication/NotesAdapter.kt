package com.timmitof.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.myapplication.models.NotesClass

class NotesAdapter(private var array: ArrayList<NotesClass>) :
    RecyclerView.Adapter<NotesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleView: TextView
        val textView: TextView

        init {
            titleView = view.findViewById(R.id.item_title)
            textView = view.findViewById(R.id.item_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotesAdapter.ViewHolder, position: Int) {
        val item = array[position]
        holder.titleView.text = item.title
        holder.textView.text = item.text
    }

    override fun getItemCount(): Int {
        return array.size
    }

}
