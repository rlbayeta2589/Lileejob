package com.example.ics_user.jollibee;

/**
 * Created by Reynaldo Bayeta III on 4/10/2017.
 */

public class Drink extends JolliFood {
    public static final Drink[] drinks = {
            new Drink("Yum", "Regular Yum", R.drawable.yum),
            new Drink("Yum with Cheese", "Yum plus cheese", R.drawable.yumcheese),
            new Drink("Yum with TLC", "Yum + TLC", R.drawable.yumtlc)

    };

    private Drink(String name, String description, int imageResourcesId){
        super(name,description,imageResourcesId);
    }
}
