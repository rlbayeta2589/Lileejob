package com.example.ics_user.jollibee;

/**
 * Created by ics-user on 4/3/17.
 */
public class Burger extends JolliFood{

    public static final Burger[] burgers = {
            new Burger("Yum", "Regular Yum", R.drawable.yum),
            new Burger("Yum with Cheese", "Yum plus cheese", R.drawable.yumcheese),
            new Burger("Yum with TLC", "Yum + TLC", R.drawable.yumtlc)

    };

    private Burger(String name, String description, int imageResourcesId){
        super(name,description,imageResourcesId);
    }
}