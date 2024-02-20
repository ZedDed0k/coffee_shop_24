package com.example.lr6.item_category_activity;

import com.example.lr6.R;
import com.example.lr6.item_category_activity.ItemCategoryActivity;
import com.example.lr6.items.Food;

public class FoodCategoryActivity extends ItemCategoryActivity {

    public FoodCategoryActivity() {
        super(R.layout.activity_items_category, Food.foods, R.id.list_items);
    }
}
