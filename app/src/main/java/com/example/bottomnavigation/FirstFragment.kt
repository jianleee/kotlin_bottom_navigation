package com.example.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var todolist = mutableListOf(
            Todo("Follow Android Dev", false),
            Todo("Go to work", false),
            Todo("Learn native Android", true),
            Todo("Eat Lunch", false),
            Todo("Hello guys", false),
            Todo("Eat Lunch", false),
            Todo("Hello Jian", false),
            Todo("Eat Lunch", false),
            Todo("Hello guys", false)
        )
        val adapter = TodoAdapter(todolist)
        rvTodos.adapter = adapter
        rvTodos.layoutManager = LinearLayoutManager(activity)
    }

}