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
        restaurant.add(new Site(R.drawable.restaurant_augubio_congo, getString(R.string.restaurant_augubio_congo_name), getString(R.string.restaurant_augubio_congo_address), getString(R.string.restaurant_augubio_congo_working_hours), getString(R.string.restaurant_augubio_congo_number)));
        restaurant.add(new Site(R.drawable.restaurant_bajamonti, getString(R.string.restaurant_bajamonti_name), getString(R.string.restaurant_bajamonti_address), getString(R.string.restaurant_bajamonti_working_hours), getString(R.string.restaurant_bajamonti_number)));
        restaurant.add(new Site(R.drawable.restaurant_bokeria, getString(R.string.restaurant_bokeria_name), getString(R.string.restaurant_bokeria_address), getString(R.string.restaurant_bokeria_working_hours), getString(R.string.restaurant_bokeria_number)));
        restaurant.add(new Site(R.drawable.restaurant_dalmatino, getString(R.string.restaurant_dalmatino_name), getString(R.string.restaurant_dalmatino_address), getString(R.string.restaurant_dalmatino_working_hours), getString(R.string.restaurant_dalmatino_number)));
        restaurant.add(new Site(R.drawable.restaurant_graso, getString(R.string.restaurant_graso_name), getString(R.string.restaurant_graso_address), getString(R.string.restaurant_graso_working_hours), getString(R.string.restaurant_graso_number)));
        restaurant.add(new Site(R.drawable.restaurant_mazzgoon, getString(R.string.restaurant_mazzgoon_name), getString(R.string.restaurant_mazzgoon_address), getString(R.string.restaurant_mazzgoon_working_hours), getString(R.string.restaurant_mazzgoon_number)));
        restaurant.add(new Site(R.drawable.restaurant_perivoj, getString(R.string.restaurant_perivoj_name), getString(R.string.restaurant_perivoj_address), getString(R.string.restaurant_perivoj_working_hours), getString(R.string.restaurant_perivoj_number)));
        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), restaurant, R.color.colorRestaurant);
        listView.setAdapter(adapter);

        return rootView;
    }
}
