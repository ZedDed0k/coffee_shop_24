package com.example.lr6.item_category_activity;

import com.example.lr6.R;
import com.example.lr6.item_category_activity.ItemCategoryActivity;
import com.example.lr6.items.CoffeePlace;

public class CoffeePlaceCategoryActivity extends ItemCategoryActivity {

    public CoffeePlaceCategoryActivity() {
        super(R.layout.activity_items_category, CoffeePlace.coffeePlaces, R.id.list_items);
    }
}
