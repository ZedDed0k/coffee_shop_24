package com.example.lr6.items;

import com.example.lr6.R;

public class CoffeePlace extends Item{

    public static final CoffeePlace[] coffeePlaces = {
            new CoffeePlace("Кофейня №1", "Улица Казинца, 80", R.drawable.kazinca80),
            new CoffeePlace("Кофейня №2", "Улица Чигладзе, 31", R.drawable.chigladze31),
            new CoffeePlace("Кофейня №3", "Улица Максима Горецкого, 63", R.drawable.goreckogo63)
    };

    private CoffeePlace(String name, String description, int imageResourceId){
        super(name, description, imageResourceId);
    }

}
