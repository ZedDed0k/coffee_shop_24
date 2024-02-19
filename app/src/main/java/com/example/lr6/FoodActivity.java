package com.example.lr6;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lr6.items.Food;

public class FoodActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM_ID = "itemId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        int foodId = (Integer) getIntent().getExtras().get(EXTRA_ITEM_ID);
        Food drink = Food.foods[foodId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
    }
}
