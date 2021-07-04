package com.example.uidesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {
    private lateinit var list:ArrayList<Example_Item>
    private lateinit var mAdapter:CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list= ArrayList()
        var item = Example_Item()
        item.setResource(R.drawable.ic_greater)
        item.setText("Session 1")
        list.add(item)
        item = Example_Item()
        item.setResource(R.drawable.ic_lock)
        item.setText("Session 2")
        list.add(item)
        item = Example_Item()
        item.setResource(R.drawable.ic_lock)
        item.setText("Session 3")
        list.add(item)
        item = Example_Item()
        item.setResource(R.drawable.ic_lock)
        item.setText("Session 4")
        list.add(item)
        item = Example_Item()
        item.setResource(R.drawable.ic_lock)
        item.setText("Session 5")
        list.add(item)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        var layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager=layoutManager
        mAdapter=CustomAdapter(list)
        recyclerView.adapter=mAdapter
        0
    }
}