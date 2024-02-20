package com.example.lr6.items;

import com.example.lr6.R;

public class Food extends Item {

    public static final Food[] foods = {
            new Food("Пицца", "Вкусная пицца", R.drawable.pizza),
            new Food("Паста", "Вкусная паста", R.drawable.pasta),
            new Food("Салат", "Свежий салат", R.drawable.salad)
    };

    private Food(String name, String description, int imageResourceId) {
        super(name, description, imageResourceId);
    }
}
