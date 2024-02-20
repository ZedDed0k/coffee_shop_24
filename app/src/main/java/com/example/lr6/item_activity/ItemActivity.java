package com.example.lr6.item_activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lr6.R;
import com.example.lr6.items.Drink;
import com.example.lr6.items.Item;

public class ItemActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM = "item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Item item = getIntent().getParcelableExtra(EXTRA_ITEM);

        TextView name = findViewById(R.id.name);
        name.setText(item.getName());

        TextView description = findViewById(R.id.description);
        description.setText(item.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(item.getImageResourceId());
        photo.setContentDescription(item.getName());
    }

}
