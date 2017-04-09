package com.example.ics_user.jollibee;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JolliFoodCategory extends ListActivity {

    public static String FOOD_TYPE = "foodType";
    public static String FOOD_INDEX = "foodIndex";

    private String foodType = "";
    private JolliFood[] emptyfood = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView categoryList = getListView();
        foodType = (String) getIntent().getExtras().get(FOOD_TYPE);

        ArrayAdapter<JolliFood> listAdapter = new ArrayAdapter<JolliFood>(
                this,android.R.layout.simple_list_item_1,emptyfood);

        switch (foodType){
            case "BURGER":
                listAdapter = new ArrayAdapter<JolliFood>(
                        this,android.R.layout.simple_list_item_1,Burger.burgers);
                break;
            case "PASTA":
                listAdapter = new ArrayAdapter<JolliFood>(
                        this,android.R.layout.simple_list_item_1,Pasta.pastas);
                break;
            case "MEAL":
                listAdapter = new ArrayAdapter<JolliFood>(
                        this,android.R.layout.simple_list_item_1,Meal.meals);
                break;
            case "SIDE":
                listAdapter = new ArrayAdapter<JolliFood>(
                        this,android.R.layout.simple_list_item_1,Side.sides);
                break;
            case "DESSERT":
                listAdapter = new ArrayAdapter<JolliFood>(
                        this,android.R.layout.simple_list_item_1,Dessert.desserts);
                break;
            case "DRINK":
                listAdapter = new ArrayAdapter<JolliFood>(
                        this,android.R.layout.simple_list_item_1,Drink.drinks);
                break;
        }

        categoryList.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(JolliFoodCategory.this, JolliFoodDetail.class);
        intent.putExtra(this.FOOD_TYPE, foodType);
        intent.putExtra(this.FOOD_INDEX, (int) id);
        startActivity(intent);
    }
}
