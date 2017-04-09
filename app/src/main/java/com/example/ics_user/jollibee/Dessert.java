package com.example.ics_user.jollibee;

/**
 * Created by Reynaldo Bayeta III on 4/10/2017.
 */

public class Dessert extends JolliFood {
    public static final Dessert[] desserts = {
            new Dessert("Yum", "Regular Yum", R.drawable.yum),
            new Dessert("Yum with Cheese", "Yum plus cheese", R.drawable.yumcheese),
            new Dessert("Yum with TLC", "Yum + TLC", R.drawable.yumtlc)

    };

    private Dessert(String name, String description, int imageResourcesId){
        super(name,description,imageResourcesId);
    }
}
