package com.example.lr6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.lr6.item_category_activity.CoffeePlaceCategoryActivity;
import com.example.lr6.item_category_activity.DrinkCategoryActivity;
import com.example.lr6.item_category_activity.FoodCategoryActivity;

public class TopLevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Class<?> categoryActivity = null;
                switch (position) {
                    case 0:
                        categoryActivity = DrinkCategoryActivity.class;
                        break;
                    case 1:
                        categoryActivity = FoodCategoryActivity.class;
                        break;
                    case 2:
                        categoryActivity = CoffeePlaceCategoryActivity.class;
                        break;
                }
                if (categoryActivity != null) {
                    Intent intent = new Intent(TopLevelActivity.this, categoryActivity);
                    startActivity(intent);
                }
            }
        });
    }
}
