package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {

    public MuseumFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        ArrayList<Site> museum = new ArrayList<>();
        museum.add(new Site(R.drawable.museum_split_city, getString(R.string.museum_split_city_name), getString(R.string.museum_split_city_address), getString(R.string.museum_split_city_number)));
        museum.add(new Site(R.drawable.museum_arheologic, getString(R.string.museum_arheologic_name), getString(R.string.museum_arheologic_address), getString(R.string.museum_arheologic_number)));
        museum.add(new Site(R.drawable.museum_etnographic, getString(R.string.museum_etnographic_name), getString(R.string.museum_etnographic_address), getString(R.string.museum_etnographic_number)));
        museum.add(new Site(R.drawable.museum_gallery_of_fine_arts, getString(R.string.museum_gallery_of_fine_arts_name), getString(R.string.museum_gallery_of_fine_arts_address), getString(R.string.museum_gallery_of_fine_arts_number)));
        museum.add(new Site(R.drawable.museum_maritime, getString(R.string.museum_maritime_name), getString(R.string.museum_maritime_address), getString(R.string.no_number)));
        museum.add(new Site(R.drawable.museum_mestrovic_gallery, getString(R.string.museum_mestrovic_gallery_name), getString(R.string.museum_mestrovic_gallery_address), getString(R.string.museum_mestrovic_gallery_number)));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), museum, R.color.colorMuseum);
        listView.setAdapter(adapter);

        return rootView;
    }
}
