package com.example.localfinder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: BusinessAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        recyclerView = findViewById(R.id.recyclerViewBusinesses)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val businessList = listOf(
            Business("Cafe Coffee Day", "Restaurant", "1.2 km", 4.5f, R.drawable.ic_launcher_background),
            Business("Bella Salon", "Salon", "0.8 km", 4.2f, R.drawable.ic_launcher_background),
            Business("FixIt Plumber", "Plumber", "2.1 km", 4.0f, R.drawable.ic_launcher_background)
        )

        adapter = BusinessAdapter(businessList)
        recyclerView.adapter = adapter
    }
}
