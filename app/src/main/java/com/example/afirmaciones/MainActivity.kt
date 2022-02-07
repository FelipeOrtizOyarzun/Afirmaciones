package com.example.afirmaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.afirmaciones.adapter.ItemAdapter
import com.example.afirmaciones.data.Datasource
import com.example.afirmaciones.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // RecyclerView ej:
        val myDataset : List<Affirmation> = Datasource().loadAffirmations()
        val recyclerView : RecyclerView = findViewById(R.id.rv)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}