package com.nokia.rakshak.listviews;

/**
 * Created by rakagraw on 25-09-2015.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String>{
    public CustomAdapter(Context context, String[] fruits) {
        super(context, R.layout.custom_row, fruits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater rakshakInflator = LayoutInflater.from(getContext());
        View customView = rakshakInflator.inflate(R.layout.custom_row, parent, false);

        String singleFruitItem = getItem(position);
        TextView rakshakText = (TextView) customView.findViewById(R.id.rakshakText);
        ImageView rakshakImage = (ImageView) customView.findViewById(R.id.rakshakImage);

        rakshakText.setText(singleFruitItem);
        rakshakImage.setImageResource(R.drawable.nokia_150_boots_1920x1080);
        return customView;
    }
}
