package com.example.ics_user.jollibee;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jancrissel on 4/15/17.
 */

public class JollibeeDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "jollibbee";
    private static final int DB_VERSION = 1;

    JollibeeDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE BURGER( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER);");

        db.execSQL("CREATE TABLE PASTA( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER);");

        db.execSQL("CREATE TABLE MEAL( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER);");

        db.execSQL("CREATE TABLE SIDE( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER);");

        db.execSQL("CREATE TABLE DESSERT( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER);");

        db.execSQL("CREATE TABLE DRINK( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER);");

        //populate
        insertItem(db,"Yum", "Regular Yum", R.drawable.yum, "BURGER");
        insertItem(db,"Yum with Cheese", "Yum plus Cheese", R.drawable.yumcheese, "BURGER");
        insertItem(db,"Yum with TLC", "Yum + TLC", R.drawable.yumtlc, "BURGER");

        insertItem(db,"Jolly Spaghetti", "Spaghetti", R.drawable.spaghetti, "PASTA");
        insertItem(db,"Palabok", "Palabok", R.drawable.palabok, "PASTA");

        insertItem(db,"Garlic Pepper Beef", "(Solo, Value Meal)", R.drawable.garlic_pepper_beef, "MEAL");
        insertItem(db,"Shanghai Rolls", "(Available from Monday-Friday only.)", R.drawable.shanghai_rolls, "MEAL");
        insertItem(db,"Burger Steak", "(1 pc., 2pcs.)", R.drawable.burgersteak, "MEAL");

        insertItem(db,"Jolly Crispy Fries", "(Regular, Large, Extra-Large)", R.drawable.fries, "SIDE");
        insertItem(db,"Creamy Macaroni Soup", "Macaroni Soup", R.drawable.soup, "SIDE");
        insertItem(db,"Peach Mango Pie", "Peach Mango Pie", R.drawable.peach_mango_pie, "SIDE");

        insertItem(db, "Sundaes", "(Chocolate, Strawberry)", R.drawable.sundae, "DESSERT");
        insertItem(db, "Creamy Shakes", "(Chocolate, Strawberry)", R.drawable.creamy_shakes, "DESSERT");
        insertItem(db, "Coke & Sarsi Float", "(Coke, Sarsi)", R.drawable.coke_float,"DESSERT");

        insertItem(db,"Iced Tea", "Regular Iced Tea", R.drawable.iced_tea, "DRINK");
        insertItem(db,"Softdrinks", "Regular Softdrinks", R.drawable.softdrinks, "DRINK");
        insertItem(db,"Pineapple", "Large Pineapple Drink", R.drawable.pineapple, "DRINK");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion == 1){

        }
        else if(oldVersion < 3){

        }
    }

    public void insertItem(SQLiteDatabase db, String name, String description, int resourceId, String table){
        ContentValues itemValues = new ContentValues();
        itemValues.put("NAME", name);
        itemValues.put("DESCRIPTION", description);
        itemValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert(table, null, itemValues);
    }

}
