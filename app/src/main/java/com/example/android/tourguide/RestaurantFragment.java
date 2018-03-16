package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        ArrayList<Site> restaurant = new ArrayList<>();
        restaurant.add(new Site(R.drawable.restaurant_augubio_congo, "Augubio Congo", "Dioklecijanova ulica 1", "8 AM - 10:45 PM", "099 323 9671"));
        restaurant.add(new Site(R.drawable.restaurant_bajamonti, "Bajamonti", "Trg Republike 1", "7:30 AM - 12 AM", "021 341 033"));
        restaurant.add(new Site(R.drawable.restaurant_bokeria, "Bokeria kitchen & wine bar", "Domaldova ulica 8", "9 AM - 1 AM", "021 355 577"));
        restaurant.add(new Site(R.drawable.restaurant_dalmatino, "Dalmatino", "Ulica Ispod Svetog Lovre 2B", "10 AM - 12 AM", "021 320 004"));
        restaurant.add(new Site(R.drawable.restaurant_graso, "Adriatic Grašo", "Uvala Baluni bb", "9 AM - 1 AM", "021 398 560"));
        restaurant.add(new Site(R.drawable.restaurant_mazzgoon, "Mazzgoon", "Bajamontijeva ulica 1", "8 AM - 1 AM", "098 987 7780"));
        restaurant.add(new Site(R.drawable.restaurant_perivoj, "Perivoj", "Slavićeva ulica 44", "9 AM - 12 AM", "021 785 875"));
        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), restaurant, R.color.colorRestaurant);
        listView.setAdapter(adapter);

        return rootView;
    }
}
