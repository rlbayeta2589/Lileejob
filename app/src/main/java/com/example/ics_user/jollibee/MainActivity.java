package com.example.ics_user.jollibee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_options);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView, View v, int position, long id) {
                        Intent intent = new Intent(MainActivity.this, JolliFoodCategory.class);

                        switch (position){
                            case 0: intent.putExtra(JolliFoodCategory.FOOD_TYPE, "BURGER");
                                break;
                            case 1: intent.putExtra(JolliFoodCategory.FOOD_TYPE, "PASTA");
                                break;
                            case 2: intent.putExtra(JolliFoodCategory.FOOD_TYPE, "MEAL");
                                break;
                            case 3: intent.putExtra(JolliFoodCategory.FOOD_TYPE, "SIDE");
                                break;
                            case 4: intent.putExtra(JolliFoodCategory.FOOD_TYPE, "DESSERT");
                                break;
                            case 5: intent.putExtra(JolliFoodCategory.FOOD_TYPE, "DRINK");
                                break;
                        }

                        startActivity(intent);
                    }
                };

        listView.setOnItemClickListener(itemClickListener);
    }

}
