package com.example.lr6.items;

import com.example.lr6.R;

public class Drink extends Item {

    public static final Drink[] drinks = {
            new Drink("Латте", "Кофейный напиток, на основе молока, представляющий собой трёхслойную смесь из пены, молока и кофе эспрессо", R.drawable.latte),
            new Drink("Капучино", "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока", R.drawable.cappuccino),
            new Drink("Раф", "Кофейный напиток, готовится путём добавления нагретых паром сливок с небольшим количеством пены в одиночную порцию эспрессо", R.drawable.raf)};

    private Drink(String name, String description, int imageResourceId) {
        super(name, description, imageResourceId);
    }

}
