package com.example.lr6.item_category_activity;

import com.example.lr6.R;
import com.example.lr6.item_category_activity.ItemCategoryActivity;
import com.example.lr6.items.Drink;

public class DrinkCategoryActivity extends ItemCategoryActivity {

    public DrinkCategoryActivity() {
        super(R.layout.activity_items_category, Drink.drinks, R.id.list_items);
    }
}
