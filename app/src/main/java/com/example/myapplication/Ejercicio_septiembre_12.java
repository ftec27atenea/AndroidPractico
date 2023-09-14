package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class Ejercicio_septiembre_12 extends AppCompatActivity {
private RecyclerView.Adapter adapter;
private RecyclerView recyclerViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_septiembre12);

        recyclerViewList=findViewById(R.id.view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewList.setLayoutManager(linearLayoutManager);
        ArrayList<ListDomain> news = new ArrayList<>();
        news.add(new ListDomain("Derrumbe en via al llano", "pic1"));
        news.add(new ListDomain("Protestas en apoyo al gobierno", "pic2"));
        news.add(new ListDomain("Accidente en calle 26", "pic3"));
        news.add(new ListDomain("Colombia empata contra Chile", "pic4"));

        adapter = new NewsAdapter(news);
        recyclerViewList.setAdapter(adapter);
    }
}