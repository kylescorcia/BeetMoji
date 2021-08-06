package com.syncappdata.keyboard.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.syncappdata.keyboard.R;
import com.syncappdata.keyboard.adapters.RecyclerViewAdapter;
import com.syncappdata.keyboard.model.ItemObject;

import java.util.ArrayList;
import java.util.List;

public class ViewEmojiActivity extends AppCompatActivity {

    RecyclerView rView;
    RecyclerViewAdapter rcAdapter;
    final String TAG = "ViewEmojiActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_emoji);


            findViewById(R.id.imageView2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });

            rView = (RecyclerView) findViewById(R.id.recycler_view);
            rView.setHasFixedSize(true);
            rView.setLayoutManager(new GridLayoutManager(this, 6, GridLayoutManager.VERTICAL, false));
            rcAdapter = new RecyclerViewAdapter(getApplicationContext(), getAllImage(), "ALL");
            rView.setAdapter(rcAdapter);
        }





    private List<ItemObject> getAllImage() {
        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject(R.mipmap.s01));
        allItems.add(new ItemObject(R.mipmap.s02));
        allItems.add(new ItemObject(R.mipmap.s03));
        allItems.add(new ItemObject(R.mipmap.s04));
        allItems.add(new ItemObject(R.mipmap.s05));
        allItems.add(new ItemObject(R.mipmap.s06));
        allItems.add(new ItemObject(R.mipmap.s07));
        allItems.add(new ItemObject(R.mipmap.s08));
        allItems.add(new ItemObject(R.mipmap.s09));
        allItems.add(new ItemObject(R.mipmap.s10));
        allItems.add(new ItemObject(R.mipmap.s11));
        allItems.add(new ItemObject(R.mipmap.s12));
        allItems.add(new ItemObject(R.mipmap.s13));
        allItems.add(new ItemObject(R.mipmap.s14));
        allItems.add(new ItemObject(R.mipmap.s15));
        allItems.add(new ItemObject(R.mipmap.s16));


        allItems.add(new ItemObject(R.mipmap.c01));
        allItems.add(new ItemObject(R.mipmap.c02));
        allItems.add(new ItemObject(R.mipmap.c03));
        allItems.add(new ItemObject(R.mipmap.c04));
        allItems.add(new ItemObject(R.mipmap.c05));
        allItems.add(new ItemObject(R.mipmap.c06));
        allItems.add(new ItemObject(R.mipmap.c07));
        allItems.add(new ItemObject(R.mipmap.c08));
        allItems.add(new ItemObject(R.mipmap.c09));
        allItems.add(new ItemObject(R.mipmap.c10));
        allItems.add(new ItemObject(R.mipmap.c11));
        allItems.add(new ItemObject(R.mipmap.c12));
        allItems.add(new ItemObject(R.mipmap.c13));
        allItems.add(new ItemObject(R.mipmap.c14));
        allItems.add(new ItemObject(R.mipmap.c15));
        allItems.add(new ItemObject(R.mipmap.c16));
        allItems.add(new ItemObject(R.mipmap.c17));
        allItems.add(new ItemObject(R.mipmap.c18));
        allItems.add(new ItemObject(R.mipmap.c19));




        allItems.add(new ItemObject(R.mipmap.b01));
        allItems.add(new ItemObject(R.mipmap.b02));
        allItems.add(new ItemObject(R.mipmap.b03));
        allItems.add(new ItemObject(R.mipmap.b04));
        allItems.add(new ItemObject(R.mipmap.b05));
        allItems.add(new ItemObject(R.mipmap.b06));
        allItems.add(new ItemObject(R.mipmap.b07));
        allItems.add(new ItemObject(R.mipmap.b08));
        allItems.add(new ItemObject(R.mipmap.b09));
        allItems.add(new ItemObject(R.mipmap.b10));
        allItems.add(new ItemObject(R.mipmap.b11));
        allItems.add(new ItemObject(R.mipmap.b12));
        allItems.add(new ItemObject(R.mipmap.b13));
        allItems.add(new ItemObject(R.mipmap.b14));
        allItems.add(new ItemObject(R.mipmap.b15));
        allItems.add(new ItemObject(R.mipmap.b16));
        allItems.add(new ItemObject(R.mipmap.b17));
        allItems.add(new ItemObject(R.mipmap.b18));
        allItems.add(new ItemObject(R.mipmap.b19));
        allItems.add(new ItemObject(R.mipmap.b20));
        allItems.add(new ItemObject(R.mipmap.b21));
        allItems.add(new ItemObject(R.mipmap.b22));
        allItems.add(new ItemObject(R.mipmap.b23));
        allItems.add(new ItemObject(R.mipmap.b24));




        allItems.add(new ItemObject(R.mipmap.a01));
        allItems.add(new ItemObject(R.mipmap.a02));
        allItems.add(new ItemObject(R.mipmap.a03));
        allItems.add(new ItemObject(R.mipmap.a04));
        allItems.add(new ItemObject(R.mipmap.a05));
        allItems.add(new ItemObject(R.mipmap.a06));
        allItems.add(new ItemObject(R.mipmap.a07));
        allItems.add(new ItemObject(R.mipmap.a08));
        allItems.add(new ItemObject(R.mipmap.a09));
        allItems.add(new ItemObject(R.mipmap.a10));
        allItems.add(new ItemObject(R.mipmap.a11));
        allItems.add(new ItemObject(R.mipmap.a12));
        allItems.add(new ItemObject(R.mipmap.a13));
        allItems.add(new ItemObject(R.mipmap.a14));
        allItems.add(new ItemObject(R.mipmap.a15));
        allItems.add(new ItemObject(R.mipmap.a16));
        allItems.add(new ItemObject(R.mipmap.a17));
        allItems.add(new ItemObject(R.mipmap.a18));
        allItems.add(new ItemObject(R.mipmap.a19));
        allItems.add(new ItemObject(R.mipmap.a20));
        allItems.add(new ItemObject(R.mipmap.a21));
        allItems.add(new ItemObject(R.mipmap.a22));
        allItems.add(new ItemObject(R.mipmap.a23));
        allItems.add(new ItemObject(R.mipmap.a24));
        allItems.add(new ItemObject(R.mipmap.a25));
        allItems.add(new ItemObject(R.mipmap.a26));



        return allItems;
    }
}
