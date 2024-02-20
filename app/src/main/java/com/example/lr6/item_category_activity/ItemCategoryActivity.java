package com.example.lr6.item_category_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lr6.item_activity.ItemActivity;
import com.example.lr6.items.Item;

public class ItemCategoryActivity extends AppCompatActivity {

    private int layoutId;
    private Item[] items;
    private int listViewId;

    public ItemCategoryActivity(int layoutId, Item[] items, int listViewId) {
        this.layoutId = layoutId;
        this.items = items;
        this.listViewId = listViewId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId);

        ArrayAdapter<Item> listAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);
        ListView listView = findViewById(listViewId);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ItemCategoryActivity.this, ItemActivity.class);
                intent.putExtra(ItemActivity.EXTRA_ITEM, items[position]);
                startActivity(intent);
            }
        });
    }
}
