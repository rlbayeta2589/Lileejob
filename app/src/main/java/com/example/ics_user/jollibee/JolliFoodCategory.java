package com.example.ics_user.jollibee;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class JolliFoodCategory extends ListActivity {

    private SQLiteDatabase db;
    private Cursor cursor;

    public static String FOOD_TYPE = "foodType";
    public static String FOOD_INDEX = "foodIndex";

    private String foodType = "";
    private JolliFood[] emptyfood = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();

        this.foodType = (String) getIntent().getExtras().get(FOOD_TYPE);
        CursorAdapter listAdapter;

        SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
        db = jollibeeDatabaseHelper.getReadableDatabase();

        cursor = db.query(foodType,
                new String[]{"_id","NAME","DESCRIPTION","IMAGE_RESOURCE_ID"},
                null,null, null, null, null);

        listAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                cursor,
                new String[]{"NAME"},
                new int[] {android.R.id.text1},
                0);
        listView.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(JolliFoodCategory.this, JolliFoodDetail.class);
        intent.putExtra(FOOD_TYPE, foodType);
        intent.putExtra(FOOD_INDEX, (int) id);
        startActivity(intent);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }
}
