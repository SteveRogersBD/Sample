package com.aniruddha.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elements = createSampleElements() // Call the function to create sample data

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = GridLayoutManager(this, 1) // 18 columns for the periodic table
        recyclerView.layoutManager = layoutManager

        // Set a large width to allow all columns without wrapping
        recyclerView.layoutParams.width =  layoutManager.spanCount

        val adapter = AdapterClass(elements)
        recyclerView.adapter = adapter
    }


    private fun createSampleElements(): List<Element> {
        // Create a list of sample elements (replace this with your actual data)
        return listOf(
            Element(1, "H", "Hydrogen"),
            Element(3, "Li", "Lithium"),
            Element(11,"Na","Sodium"),
            Element(19,"K","Potassium"),
            Element(37,"Rb","Rubidium"),
            Element(55,"Cs","Caseium"),
            Element(87,"Fr","Francium"),
            Element(119,"Uue","Ununennium"),
            Element(119,"Uue","Ununennium"),
            Element(119,"Uue","Ununennium"),
            Element(119,"Uue","Ununennium"),
            Element(119,"Uue","Ununennium"),
            Element(119,"Uue","Ununennium")

        )
    }
}
