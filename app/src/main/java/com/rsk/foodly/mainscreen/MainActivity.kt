package com.rsk.foodly.mainscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rsk.foodly.R

class MainActivity: AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MenuActivityMainRecyclerViewAdapter.ViewHolder> ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        layoutManager = LinearLayoutManager(this)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView_activity_main)

        val data = activity_main_menu_data()
        adapter = MenuActivityMainRecyclerViewAdapter(data)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter
        //adding an onClickListener to each ViewHolder on the recycler View
       // (adapter as MenuActivityMainRecyclerViewAdapter).setOnItemClickListener()


    }




}