package com.example.plantr.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.plantr.R


class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    private val context: Context? = null
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.select_language_item_layout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
       // holder.textView.text = ItemsViewModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View)  : RecyclerView.ViewHolder(ItemView) {
        private val context: Context? = null
        var onItemClick: ((ItemsViewModel) -> Unit)? = null
        var contacts: List<ItemsViewModel> = emptyList()
        val imageView: ImageView = itemView.findViewById(R.id.imgv1)
       // val textView: TextView = itemView.findViewById(R.id.textView)
       init {
           itemView.setOnClickListener {
               onItemClick?.invoke(contacts[adapterPosition])


//               if (adapterPosition==0){
//
////                       val intent = Intent(context, MainActivity::class.java)
////                       intent.putExtra("your_extra", "your_class_value")
////                       context?.startActivity(intent)
//                   val myactivity = Intent(context?.applicationContext, MainActivity::class.java)
//                   myactivity.addFlags(FLAG_ACTIVITY_NEW_TASK)
//                   context?.applicationContext?.startActivity(myactivity)
//                   }

               Log.d("TAG", ": " +adapterPosition)
           }
       }
    }


}