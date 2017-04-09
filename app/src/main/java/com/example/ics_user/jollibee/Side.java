package com.example.ics_user.jollibee;

/**
 * Created by Reynaldo Bayeta III on 4/10/2017.
 */

public class Side extends JolliFood {
    public static final Side[] sides = {
            new Side("Yum", "Regular Yum", R.drawable.yum),
            new Side("Yum with Cheese", "Yum plus cheese", R.drawable.yumcheese),
            new Side("Yum with TLC", "Yum + TLC", R.drawable.yumtlc)

    };

    private Side(String name, String description, int imageResourcesId){
        super(name,description,imageResourcesId);
    }
}
