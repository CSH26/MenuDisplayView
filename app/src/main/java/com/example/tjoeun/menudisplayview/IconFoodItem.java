package com.example.tjoeun.menudisplayview;

import android.graphics.drawable.Drawable;

/**
 * Created by csh on 2016-04-19.
 */
public class IconFoodItem {

    private boolean mSelectable;
    private Drawable fIcon;
    private String[] fData;
    private Drawable like_image;

    public IconFoodItem(Drawable icon, String[] obj, Drawable like){
        fIcon = icon;
        fData = obj;
        like_image = like;
    }

    public IconFoodItem(Drawable icon, String menu, String detail, Drawable like){
        fIcon = icon;
        fData = new String[2];
        fData[0] = menu;
        fData[1] = detail;
        like_image = like;
    }

    public String[] getData(){
        return fData;
    }

    public String getfData(int index) {
        return fData[index];
    }

    public boolean isSelectable(){
        return mSelectable;
    }

    public void setSelectable(boolean selectable){
        mSelectable = selectable;
    }

    public void setData(String[] food){
        fData = food;
    }

    public void setIcon(Drawable icon){
        fIcon = icon;
    }

    public Drawable getIcon(){
        return fIcon;
    }

    public Drawable getLike_image() {
        return like_image;
    }
}
