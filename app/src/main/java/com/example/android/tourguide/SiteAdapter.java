package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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

        MainActivity.ViewHolder holder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
            holder = new MainActivity.ViewHolder();
            holder.name = convertView.findViewById(R.id.name);
            holder.address = convertView.findViewById(R.id.address);
            holder.number = convertView.findViewById(R.id.number);
            holder.description = convertView.findViewById(R.id.description);
            holder.workingHours = convertView.findViewById(R.id.hours);
            holder.image = convertView.findViewById(R.id.image);
            holder.textContainer = convertView.findViewById(R.id.text_container);
            convertView.setTag(holder);
        }
        else {
            holder = (MainActivity.ViewHolder) convertView.getTag();
        }

        Site currentSite = getItem(position);

        holder.image.setImageResource(currentSite.getImageResourceId());
        holder.name.setText(currentSite.getName());

        if (currentSite.hasAddress()) {
            holder.address.setText(mContext.getResources().getString(R.string.address) + " " + currentSite.getAddress());
        } else {
            holder.address.setVisibility(View.GONE);
        }

        if (currentSite.hasHours()) {
            holder.workingHours.setText(mContext.getResources().getString(R.string.hours) + " " + currentSite.getWorkingHours());

        } else {
            holder.workingHours.setVisibility(View.GONE);
        }

        if (currentSite.hasNumber()) {
            holder.number.setText(mContext.getResources().getString(R.string.number) + " " + currentSite.getTelephoneNumber());
        } else {
            holder.number.setVisibility(View.GONE);
        }

        if (currentSite.hasDescription()) {
            holder.description.setText(currentSite.getDescription());
        } else {
            holder.description.setVisibility(View.GONE);
        }

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        holder.textContainer.setBackgroundColor(color);

        return convertView;
    }
}
