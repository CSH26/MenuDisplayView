package com.example.tjoeun.menudisplayview;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button detailButton;
    private ListView listView;
    private IconFoodListAdapter adapter;
    private Resources res;
    private int itemPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        detailButton = (Button)findViewById(R.id.detailbutton);
        listView = (ListView)findViewById(R.id.listView1);
        adapter = new IconFoodListAdapter(this);
        res = getResources();

        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.chicken), "치킨", "달콤한 양념을 더해 윤기가 차르르", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.jajangmyun), "된장짜장", "색다른 짜장을 원한다면", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.tang), "묵은지감자탕", "묵은지를 넣어 개운한", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.galbi), "치즈 등갈비", "치즈와 등갈비의 쫀득한 조합", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.chicken), "치즈 등갈비", "치즈와 등갈비의 쫀득한 조합치즈와 등갈비의 쫀득한 조합치즈와 등갈비의 쫀득한 조합", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.chicken), "치킨", "달콤한 양념을 더해 윤기가 차르르", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.jajangmyun), "된장짜장", "색다른 짜장을 원한다면", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.tang), "묵은지감자탕", "묵은지를 넣어 개운한", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.galbi), "치즈 등갈비", "치즈와 등갈비의 쫀득한 조합", res.getDrawable(R.drawable.like_white)));
        adapter.addItem(new IconFoodItem(res.getDrawable(R.drawable.chicken), "치즈 등갈비", "치즈와 등갈비의 쫀득한 조합치즈와 등갈비의 쫀득한 조합치즈와 등갈비의 쫀득한 조합", res.getDrawable(R.drawable.like_white)));

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IconFoodItem curItem = (IconFoodItem)adapter.getItem(position);
                String curData[] = curItem.getData();
                itemPosition = position;
                Toast.makeText(getApplicationContext(),"Selected : "+curData[0],Toast.LENGTH_LONG).show();
            }
        });

    }
}
