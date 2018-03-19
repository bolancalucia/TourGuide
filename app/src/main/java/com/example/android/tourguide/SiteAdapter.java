package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends ArrayAdapter<Site> {

    private int mColorResourceId;
    private Context mContext;

    public SiteAdapter(Context context, ArrayList<Site> sites, int colorResourceId) {
        super(context, 0, sites);
        mColorResourceId = colorResourceId;
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        Site currentSite = getItem(position);

        ImageView image = listView.findViewById(R.id.image);
        image.setImageResource(currentSite.getImageResourceId());

        TextView name = listView.findViewById(R.id.name);
        name.setText(currentSite.getName());

        TextView address = listView.findViewById(R.id.address);
        if (currentSite.hasAddress()) {
            address.setText(mContext.getResources().getString(R.string.address) + " " + currentSite.getAddress());
        } else {
            address.setVisibility(View.GONE);
        }

        TextView workingHours = listView.findViewById(R.id.hours);
        if (currentSite.hasHours()) {
            workingHours.setText(mContext.getResources().getString(R.string.hours) + " " + currentSite.getWorkingHours());

        } else {
            workingHours.setVisibility(View.GONE);
        }

        TextView number = listView.findViewById(R.id.number);
        if (currentSite.hasNumber()) {
            number.setText(mContext.getResources().getString(R.string.number) + " " + currentSite.getTelephoneNumber());
        } else {
            number.setVisibility(View.GONE);
        }

        TextView description = listView.findViewById(R.id.description);
        if (currentSite.hasDescription()) {
            description.setText(currentSite.getDescription());
        } else {
            description.setVisibility(View.GONE);
        }

        View textContainer = listView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listView;
    }
}
