package com.example.tjoeun.menudisplayview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by csh on 2016-04-19.
 */
public class IconFoodView extends LinearLayout {

    private FrameLayout frameLayout;
    private ImageView fIcon;
    private TextView fText01;
    private TextView fText02;
    private ImageView likeView;
    private Button detailButton;

    public IconFoodView(Context context, IconFoodItem item){
        super(context);

        frameLayout =(FrameLayout)findViewById(R.id.frameLayout);
        final LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.listitem,this,true);

        fIcon = (ImageView)findViewById(R.id.iconItem);
        fIcon.setImageDrawable(item.getIcon());

        fText01 = (TextView)findViewById(R.id.dataItem01);
        fText01.setText(item.getfData(0));
        fText02 = (TextView)findViewById(R.id.dataItem02);
        fText02.setText(item.getfData(1));
        likeView = (ImageView)findViewById(R.id.dataItem03);
        fIcon.setImageDrawable(item.getLike_image());

        detailButton = (Button)findViewById(R.id.detailbutton);
        detailButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                frameLayout.setVisibility(VISIBLE);
            }
        });
    }

    public void setText(int index, String data){
        if(index == 0){
            fText01.setText(data);
        }
        else if(index==1){
            fText02.setText(data);
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    public void setLikeView(Drawable like) {
        likeView.setImageDrawable(like);
    }

    public void setIcon(Drawable icon){
        fIcon.setImageDrawable(icon);
    }
}
