package com.example.revisionproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*


class CustomAdapter(val userList : ArrayList<data>, private val OnDetailsClickListnear : OnDetailsClickListnear): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val data: data = userList[position]
        holder.name_book.text = data.bookName
        holder.author_book.text = data.bookAuthor.toString()
        holder.image_book.setImageResource(data.bookImage)
        holder.my_data = data

        holder.itemView.setOnClickListener {
            OnDetailsClickListnear.onDetailsClickListnear(data)
        }


    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View, var my_data: data? = null) :
        RecyclerView.ViewHolder(itemView) {
        // catch the element


        val name_book = itemView.book_name as TextView
        val author_book = itemView.book_author as TextView
        val image_book = itemView.book_img as ImageView


    }
}