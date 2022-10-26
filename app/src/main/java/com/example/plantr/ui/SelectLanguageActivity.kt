package com.example.plantr.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.plantr.R
import com.example.plantr.ui.adapter.CustomAdapter
import com.example.plantr.ui.adapter.ItemsViewModel
import kotlinx.android.synthetic.main.activity_select_language.*

class SelectLanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_language)


        val recyclerview = findViewById<RecyclerView>(R.id.selectLanguageRecyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = GridLayoutManager(this, 4)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..40) {
            data.add(ItemsViewModel(R.drawable.ic_baseline_language_24, "Item " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)


        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


        save.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
