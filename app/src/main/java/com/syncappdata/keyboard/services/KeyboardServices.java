package com.syncappdata.keyboard.services;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.syncappdata.keyboard.R;
import com.syncappdata.keyboard.activities.SplashScreen;
import com.syncappdata.keyboard.adapters.RecyclerViewAdapter;
import com.syncappdata.keyboard.model.ItemObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by divyanshingle on 09/03/16.
 */
public class KeyboardServices extends InputMethodService implements View.OnClickListener {
    RecyclerView rView;
    RecyclerViewAdapter rcAdapter;
    public static KeyboardServices services;

    @Override
    public View onCreateInputView() {

            View view = getLayoutInflater().inflate(R.layout.preview, null);
        if(isStoragePermissionGranted()) {
            view.findViewById(R.id.animal).setOnClickListener(this);
            view.findViewById(R.id.girls).setOnClickListener(this);
            view.findViewById(R.id.sticker2).setOnClickListener(this);
            view.findViewById(R.id.stickers).setOnClickListener(this);
            SharedPreferences sharedPreferences = getSharedPreferences(SplashScreen.TAG, MODE_PRIVATE);
            rView = (RecyclerView) view.findViewById(R.id.recycler_view);
            rView.getLayoutParams().height = sharedPreferences.getInt(SplashScreen.HEIGHT, 250);
            rView.setHasFixedSize(true);
            services = this;
            rView.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false));
            rcAdapter = new RecyclerViewAdapter(getApplicationContext(), getSticker1(), "sticker");
            rView.setAdapter(rcAdapter);
        }
        else{
            Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.syncappdata.keyboard");
            startActivity(launchIntent);
        }
        return view;
    }

    private final String TAG = "KeyboardServices";
    public boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v(TAG, "Permission is granted");
                return true;
            } else {
                Log.v(TAG, "Permission is revoked");
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.syncappdata.keyboard");
                startActivity(launchIntent);
                return false;
            }
        } else { //permission is automatically granted on sdk<23 upon installation
            Log.v(TAG, "Permission is granted");
            return true;
        }
    }
    /**
     * If want to change images of Sticker 2 section then please change a(n) image name..
     * This image is placed on mipmap-xxhdpi
     * @return
     */
    private List<ItemObject> getStickers2() {
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
        return allItems;
    }
    /**
     * If want to change images of Sticker 1 section then please change a(n) image name..
     * This image is placed on mipmap-xxhdpi
     * @return
     */
    private List<ItemObject> getSticker1() {
        List<ItemObject> allItems = new ArrayList<ItemObject>();
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
    

        return allItems;
    }
    /**
     * If want to change images of Girls section then please change a(n) image name..
     * This image is placed on mipmap-xxhdpi
     * @return
     */
    private List<ItemObject> getChannels() {
        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject(R.mipmap.b01));
       // allItems.add(new ItemObject(R.mipmap.b02));
        allItems.add(new ItemObject(R.mipmap.b03));
       // allItems.add(new ItemObject(R.mipmap.b04));
        allItems.add(new ItemObject(R.mipmap.b05));
        allItems.add(new ItemObject(R.mipmap.b06));
        allItems.add(new ItemObject(R.mipmap.b07));
        allItems.add(new ItemObject(R.mipmap.b08));
        allItems.add(new ItemObject(R.mipmap.b09));
        allItems.add(new ItemObject(R.mipmap.b10));
        allItems.add(new ItemObject(R.mipmap.b11));
    //    allItems.add(new ItemObject(R.mipmap.b12));
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
           return allItems;
    }


    /**
     * If want to change images of animals section then please change a(n) image name..
     * This image is placed on mipmap-xxhdpi
     * @return
     */
    private List<ItemObject> getAnimals() {
        List<ItemObject> allItems = new ArrayList<ItemObject>();
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.animal:
                rView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false));
                rcAdapter = new RecyclerViewAdapter(getApplicationContext(), getAnimals(), "animals");
                rView.setAdapter(rcAdapter);
                break;
            case R.id.girls:
                rView.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false));
                rcAdapter = new RecyclerViewAdapter(getApplicationContext(), getChannels(), "girls");
                rView.setAdapter(rcAdapter);
                break;
            case R.id.stickers:
                rView.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false));
                rcAdapter = new RecyclerViewAdapter(getApplicationContext(), getSticker1(), "sticker");
                rView.setAdapter(rcAdapter);
                break;
            case R.id.sticker2:
                rView.setLayoutManager(new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false));
                rcAdapter = new RecyclerViewAdapter(getApplicationContext(), getStickers2(), "sticker");
                rView.setAdapter(rcAdapter);
                break;
        }
    }
}