package com.example.lr6;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lr6.items.CoffeePlace;

public class CoffeePlaceActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM_ID = "itemId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        
        int coffeePlaceId = (Integer) getIntent().getExtras().get(EXTRA_ITEM_ID);
        CoffeePlace coffeePlace = CoffeePlace.coffeePlaces[coffeePlaceId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(coffeePlace.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(coffeePlace.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(coffeePlace.getImageResourceId());
        photo.setContentDescription(coffeePlace.getName());
    }
}
