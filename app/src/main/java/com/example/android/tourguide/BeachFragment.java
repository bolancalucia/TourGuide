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
        beach.add(new Site(getString(R.string.beach_bacvice_name), R.drawable.beach_bacvice, getString(R.string.beach_bacvice_address)));
        beach.add(new Site(getString(R.string.beach_bene_name), R.drawable.beach_bene, getString(R.string.beach_bene_address)));
        beach.add(new Site(getString(R.string.beach_firule_name), R.drawable.beach_firule, getString(R.string.beach_firule_address)));
        beach.add(new Site(getString(R.string.beach_kasjuni_name), R.drawable.beach_kasjuni, getString(R.string.beach_kasjuni_address)));
        beach.add(new Site(getString(R.string.beach_obojena_name), R.drawable.beach_obojena, getString(R.string.beach_obojena_address)));
        beach.add(new Site(getString(R.string.beach_znjan_name), R.drawable.beach_znjan, getString(R.string.beach_znjan_address)));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), beach, R.color.colorBeach);
        listView.setAdapter(adapter);

        return rootView;
    }
}
