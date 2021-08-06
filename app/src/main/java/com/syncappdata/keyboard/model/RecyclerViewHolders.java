package com.syncappdata.keyboard.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.syncappdata.keyboard.R;
import com.syncappdata.keyboard.services.KeyboardServices;

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView mEmoji;
    private Context mContext;


    public RecyclerViewHolders(View itemView, Context context, String data) {
        super(itemView);
        this.mContext = context;
        mEmoji = (ImageView) itemView.findViewById(R.id.emoji);
        if (!data.equals("ALL")) {
            mEmoji.setOnClickListener(this);
        }


    }

    @Override
    public void onClick(View view) {
        Intent shareIntent = new Intent();
        shareIntent.setAction(Intent.ACTION_SEND);
        shareIntent.setType("image/png");
        ImageView imageView = (ImageView) view;

        Drawable mDrawable = imageView.getDrawable();
        Bitmap mBitmap = ((BitmapDrawable) mDrawable).getBitmap();

        String path = MediaStore.Images.Media.insertImage(mContext.getContentResolver(), mBitmap, "Image Description", null);
        Uri uri = Uri.parse(path);
        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        shareIntent.addFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent new_intent = Intent.createChooser(shareIntent, "Share Emoji!!");
        new_intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        KeyboardServices.services.getBaseContext().startActivity(new_intent);

    }


}