package com.example.ics_user.jollibee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class JolliFoodDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jollifood_detail);

        String foodType = (String) getIntent().getExtras().get(JolliFoodCategory.FOOD_TYPE);
        int index = (Integer) getIntent().getExtras().get(JolliFoodCategory.FOOD_INDEX);

        JolliFood food = new JolliFood("x", "y", 0);

        switch (foodType){
            case "BURGER": food = Burger.burgers[index];
                break;
            case "PASTA": food = Pasta.pastas[index];
                break;
            case "MEAL": food = Meal.meals[index];
                break;
            case "SIDE": food = Side.sides[index];
                break;
            case "DESSERT": food = Dessert.desserts[index];
                break;
            case "DRINK": food = Drink.drinks[index];
                break;
        }

        //Populate Image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(food.getImageResourceId());
        photo.setContentDescription(food.getName());

        //Name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(food.getName());

        //Description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(food.getDescription());
    }

}
