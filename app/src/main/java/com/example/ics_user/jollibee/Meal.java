package com.example.ics_user.jollibee;

/**
 * Created by Reynaldo Bayeta III on 4/10/2017.
 */

public class Meal extends JolliFood{
    
    public static final Meal[] meals = {
            new Meal("Yum", "Regular Yum", R.drawable.yum),
            new Meal("Yum with Cheese", "Yum plus cheese", R.drawable.yumcheese),
            new Meal("Yum with TLC", "Yum + TLC", R.drawable.yumtlc)

    };

    private Meal(String name, String description, int imageResourcesId){
        super(name,description,imageResourcesId);
    }
    
}
