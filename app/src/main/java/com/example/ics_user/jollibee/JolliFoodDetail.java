package com.example.ics_user.jollibee;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class JolliFoodDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jollifood_detail);

        String foodType = (String) getIntent().getExtras().get(JolliFoodCategory.FOOD_TYPE);
        int index = (int) getIntent().getExtras().get(JolliFoodCategory.FOOD_INDEX);

        try {
            SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
            SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

            Cursor cursor = db.query(foodType,
                    new String[]{"NAME, DESCRIPTION, IMAGE_RESOURCE_ID"},
                    "_id=?",
                    new String[]{Integer.toString(index)},
                    null, null, null);

            if(cursor.moveToFirst()){
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                int photoId = cursor.getInt(2);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);
            }
            Toast toast = Toast.makeText(this, "Database Success", Toast.LENGTH_LONG);
            toast.show();

            cursor.close();
            db.close();

        }
        catch(SQLiteException e){

        }
    }
}
