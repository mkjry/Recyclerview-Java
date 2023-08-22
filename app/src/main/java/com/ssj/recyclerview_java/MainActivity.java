package com.ssj.recyclerview_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import data.CustomDataModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerviewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        DrawRecyclerView();
    }

    private void DrawRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerviewAdapter = new RecyclerAdapter(loadDummyDataList());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerviewAdapter);
    }

    private ArrayList<CustomDataModel> loadDummyDataList() {
        ArrayList<CustomDataModel> dataList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            String iString = Integer.toString(i);
            dataList.add(new CustomDataModel(R.mipmap.ic_launcher, "Title " + iString, "Description " + iString));
        }
        return dataList;
    }
}