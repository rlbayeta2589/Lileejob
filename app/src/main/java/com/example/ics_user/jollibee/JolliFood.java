package com.example.ics_user.jollibee;

/**
 * Created by Reynaldo Bayeta III on 4/9/2017.
 */

public class JolliFood {
    protected String name;
    protected String description;
    protected int imageResourceId;

    public JolliFood(String name, String description, int imageResourcesId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourcesId;
    }

    public String getDescription(){
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    public String toString(){
        return this.name;
    }

}
