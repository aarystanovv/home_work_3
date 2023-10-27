package com.example.home_work_3

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val items: MutableList<Item> = ArrayList()
        items.add(Item("Andrés Iniesta", "andres.iniesta@email.com", R.drawable.a))
        items.add(Item("Lionel Messi", "leo.messi@email.com", R.drawable.b))
        items.add(Item("Carles Puyol", "carles.puyol@email.com", R.drawable.c))
        items.add(Item("Víctor Valdés", "victor.valdes@email.com", R.drawable.d))
        items.add(Item("Sergio Busquets", "sergio.busquets@email.com", R.drawable.e))
        items.add(Item("Gerard Piqué", "gerard.pique@email.com", R.drawable.f))
        items.add(Item("Dani Alves", "dani.alves@email.com", R.drawable.g))
        items.add(Item("Luis Suárez", "luis.suarez@email.com", R.drawable.h))
        items.add(Item("Neymar JR", "neymar.jr@email.com", R.drawable.n))
        items.add(Item("David Villa", "david.villa@email.com", R.drawable.z))
        items.add(Item("Jordi Alba", "jordi.alba@email.com", R.drawable.j))
        items.add(Item("Patrick Kluivert", "p.kluivert@email.com", R.drawable.p))
        items.add(Item("Ronald Koeman", "ronald.koeman@email.com", R.drawable.r))
        items.add(Item("Pep Guardiola", "pep.guardiola@email.com", R.drawable.m))
        items.add(Item("Samuel Eto’o", "samuel.etoo@email.com", R.drawable.o))
        items.add(Item("Johan Cruyff", "johan.c@email.com", R.drawable.l))


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(applicationContext, items)


    }
}