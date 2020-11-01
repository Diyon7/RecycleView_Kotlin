package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Users>()
    val listUsers = arrayOf(
        "Alpha",
        "Bravo",
        "Diyon",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "Carena",
        "Juliet"
    )

    val halo = arrayOf(
        "Halo"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listUsers.size) {
            list.add(Users(listUsers.get(i), halo.get(0)))
            if (listUsers.size - 1 == i) {
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                mRecyclerView.adapter = adapter
            }
        }
    }
}