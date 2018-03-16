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
        museum.add(new Site(R.drawable.museum_split_city, "Papalić Palace and the City Museum", "Papalićeva ulica 1", "021 344 917"));
        museum.add(new Site(R.drawable.museum_arheologic, "Museum of Croatian Archaeological Monuments", "Gunjačina ulica bb", "021 323 901"));
        museum.add(new Site(R.drawable.museum_etnographic, "Ethnographic museum Split", "Ulica Iza Vestibula 4", "021 343 108"));
        museum.add(new Site(R.drawable.museum_gallery_of_fine_arts, "Gallery of Fine Arts", "Kralja Tomislava 15", "021 350 110"));
        museum.add(new Site(R.drawable.museum_maritime, "Croatian Maritime Museum", "Glagoljaška ulica 18", "No number"));
        museum.add(new Site(R.drawable.museum_mestrovic_gallery, "Ivan Meštrović Gallery", "Šetalište Ivana Meštrovića 46", "021 340 800"));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), museum, R.color.colorMuseum);
        listView.setAdapter(adapter);

        return rootView;
    }
}
