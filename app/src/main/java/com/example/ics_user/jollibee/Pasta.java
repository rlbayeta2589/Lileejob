package com.example.ics_user.jollibee;

/**
 * Created by Reynaldo Bayeta III on 4/10/2017.
 */

public class Pasta extends JolliFood{

    public static final Pasta[] pastas = {
            new Pasta("Yum", "Regular Yum", R.drawable.yum),
            new Pasta("Yum with Cheese", "Yum plus cheese", R.drawable.yumcheese),
            new Pasta("Yum with TLC", "Yum + TLC", R.drawable.yumtlc)

    };

    private Pasta(String name, String description, int imageResourcesId){
        super(name,description,imageResourcesId);
    }
}
