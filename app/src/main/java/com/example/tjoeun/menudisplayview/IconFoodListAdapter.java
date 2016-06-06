package com.example.tjoeun.menudisplayview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by csh on 2016-04-19.
 */
public class IconFoodListAdapter extends BaseAdapter {

    private Context fContext;
    private List<IconFoodItem> fItems = new ArrayList<IconFoodItem>();

    public IconFoodListAdapter(Context context){
        fContext = context;
    }

    public int getCount(){
        return fItems.size();
    }

    public void addItem(IconFoodItem it){
        fItems.add(it);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        IconFoodView itemView;

        if(convertView == null){
            itemView = new IconFoodView(fContext,fItems.get(position));
        }else {
            itemView = (IconFoodView) convertView;
        }

        itemView.setIcon(fItems.get(position).getIcon());
        itemView.setText(0, fItems.get(position).getfData(0));
        itemView.setText(1,fItems.get(position).getfData(1));
        itemView.setLikeView(fItems.get(position).getLike_image());
        return itemView;
    }

    @Override
    public Object getItem(int position) {
        return fItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
