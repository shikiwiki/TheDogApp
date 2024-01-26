package com.example.thedogapp.adapters


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thedogapp.R
import com.example.thedogapp.domain.model.Dog

class DogAdapter(private val dogs: ArrayList<Dog>) :
    RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_item, parent, false)
        return DogViewHolder(itemView)
    }

    override fun getItemCount(): Int = dogs.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val currentDog = dogs[position]
//        holder.image.setImageResource(currentDog.imageUrl)
        holder.name.text = currentDog.name

    }

    class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)
        val image: ImageView = itemView.findViewById(R.id.image)

    }
}