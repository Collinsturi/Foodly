package com.rsk.foodly.mainscreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rsk.foodly.R


class MenuActivityMainRecyclerViewAdapter(var data: activity_main_menu_data): RecyclerView.Adapter<MenuActivityMainRecyclerViewAdapter.ViewHolder>() {

   // private lateinit var mlistener: onItemClickListener

    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main_recycler_card, parent, false)

       // return ViewHolder(view, mlistener)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(data.image[position])
        holder.productName.text = data.productName[position]
        holder.productDescription.text = data.productDescription[position]
        holder.btnTimeString.text = data.btnTimeString[position]
        holder.btnRatingString.text = data.btnRatingString[position]
        holder.btnAmountText.text = data.btnAmountTxt[position]
        holder.reviewText.text = data.reviewtxt[position]

    }

    override fun getItemCount(): Int {
        return data.productName.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image: ImageView
        var productName: TextView
        var productDescription: TextView
        var btnTimeString: Button
        var btnRatingString: Button
        var btnAmountText: Button
        var reviewText: TextView

        init {
            image = itemView.findViewById(R.id.imgRecyclerViewCardView)
            productName = itemView.findViewById(R.id.txtRecyclerViewCardViewName)
            productDescription = itemView.findViewById(R.id.txtRecyclerViewCardViewDescription)
            btnTimeString = itemView.findViewById(R.id.btnRecyclerViewCardViewTime)
            btnRatingString = itemView.findViewById(R.id.btnRecyclerViewCardViewRating)
            btnAmountText = itemView.findViewById(R.id.btnRecyclerViewCardViewAmount)
            reviewText = itemView.findViewById(R.id.txtRecyclerCardViewReview)

//            itemView.setOnClickListener {
//                listener.onItemClick(adapterPosition)
//            }
        }

    }


}