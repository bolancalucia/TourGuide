package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachFragment extends Fragment {

    public BeachFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        ArrayList<Site> beach = new ArrayList<>();
        beach.add(new Site("Bačvice", R.drawable.beach_bacvice, "Uvala Bačvice"));
        beach.add(new Site("Bene", R.drawable.beach_bene, "Šetalište Marina Tartaglie"));
        beach.add(new Site("Firule", R.drawable.beach_firule, "Ulica Uvala Zenta"));
        beach.add(new Site("Kašjuni", R.drawable.beach_kasjuni, "Šetalište Ivana Meštrovića 55"));
        beach.add(new Site("Obojena", R.drawable.beach_obojena, "Šetalište Ivana Meštrovića 35"));
        beach.add(new Site("Žnjan", R.drawable.beach_znjan, "Šetalište Pape Ivana Pavla II 31"));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), beach, R.color.colorBeach);
        listView.setAdapter(adapter);

        return rootView;
    }
}
