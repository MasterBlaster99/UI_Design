package com.example.uidesign

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val imgRlist: List<Example_Item>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = imgRlist[position]
        holder.text.text=ItemsViewModel.getText()
        ItemsViewModel.getResource()?.let { holder.imageView.setImageResource(it) }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return imgRlist.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        var text: TextView = itemView.findViewById(R.id.text)
    }
}
