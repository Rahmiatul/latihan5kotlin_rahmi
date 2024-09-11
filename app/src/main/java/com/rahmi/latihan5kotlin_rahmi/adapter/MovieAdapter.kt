package com.rahmi.latihan5kotlin_rahmi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rahmi.latihan5kotlin_rahmi.Model.ModelMovie
import com.rahmi.latihan5kotlin_rahmi.R
import com.rahmi.latihan5kotlin_rahmi.RvCardMovie

class MovieAdapter constructor(
    private val getActivity: RvCardMovie, //bisa diklik
    private val movieList: List<ModelMovie>) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie : TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView : CardView = itemView.findViewById(R.id.card_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        holder.cardView.setOnClickListener(){
            Toast.makeText(
                getActivity, movieList[position].title,
                Toast.LENGTH_SHORT
            ).show()
        }
    }


}