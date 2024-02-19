package com.example.lr6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lr6.items.Food;

public class FoodCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_category);
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Food.foods);
        ListView listItems = (ListView) findViewById(R.id.list_items);
        listItems.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listItems, View itemView, int position, long id) {
                Intent intent = new Intent(FoodCategoryActivity.this, FoodActivity.class);
                intent.putExtra(FoodActivity.EXTRA_ITEM_ID, (int) id);
                startActivity(intent);
            }
        };
        listItems.setOnItemClickListener(itemClickListener);
    }
}
