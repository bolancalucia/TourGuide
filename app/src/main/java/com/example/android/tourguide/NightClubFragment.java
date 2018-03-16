package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightClubFragment extends Fragment {

    public NightClubFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        ArrayList<Site> nightClub = new ArrayList<>();
        nightClub.add(new Site(R.drawable.club_central, "Central", "Trg Gaje Bulata 4", "12:30 - 6 AM", "091 332 3234"));
        nightClub.add(new Site(R.drawable.club_judino_drvo, "Judas Tree", "Kopilica ulica", "9 PM - 4 AM", "095 766 2367"));
        nightClub.add(new Site(R.drawable.club_kauri, "Kauri", "Poljička cesta", "Open 24 hours", "099 242 44444"));
        nightClub.add(new Site(R.drawable.club_quasimodo, "Quasimodo", "Ulica Ivana Gundulića 26", "", "091 934 273"));
        nightClub.add(new Site(R.drawable.club_tropic, "Tropic", "Plaža Bačvice", "10 PM - 4 AM", "099 203 9222"));
        nightClub.add(new Site(R.drawable.club_vanilla, "Vanilla", "Poljudsko šetalište b.b.", "10 PM - 5 AM", "099 831 3050"));
        nightClub.add(new Site(R.drawable.club_velvet, "Velvet", "Put Supavla 1A", "10 PM - 4 AM", "095 897 1277"));
        nightClub.add(new Site(R.drawable.club_zenta, "Zenta", "Ulica Uvala Zenta 2", "10 AM - 6 AM", "098 455 578"));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), nightClub, R.color.colorNightClub);
        listView.setAdapter(adapter);

        return rootView;
    }
}
