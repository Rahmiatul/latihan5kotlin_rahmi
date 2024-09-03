package com.rahmi.latihan5kotlin_rahmi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private lateinit var lv_item : ListView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        lv_item = findViewById(R.id.btnListView)

        val namaHewan = listOf( "Kupu-kupu", "beruang", "Gajah", "Kelinci", "kura-kura")
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

    }
}