package com.example.expandablelistviewapp;


import android.os.Bundle;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    ExpandableListAdapter adapter;
    List<String> groupList;
    HashMap<String, List<String>> childMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandableListView);


        prepareData();


        adapter = new ExpandableListAdapter(this, groupList, childMap);
        expandableListView.setAdapter(adapter);
    }

    private void prepareData() {
        groupList = new ArrayList<>();
        childMap = new HashMap<>();


        groupList.add("Fruits");
        groupList.add("Vegetables");
        groupList.add("Dairy");


        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Spinach");

        List<String> dairy = new ArrayList<>();
        dairy.add("Milk");
        dairy.add("Cheese");
        dairy.add("Butter");


        childMap.put(groupList.get(0), fruits);
        childMap.put(groupList.get(1), vegetables);
        childMap.put(groupList.get(2), dairy);
    }
}

