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
        nightClub.add(new Site(R.drawable.club_central, getString(R.string.club_central_name), getString(R.string.club_central_address), getString(R.string.club_central_working_hours), getString(R.string.club_central_number)));
        nightClub.add(new Site(R.drawable.club_judino_drvo, getString(R.string.club_judino_drvo_name), getString(R.string.club_judino_drvo_address), getString(R.string.club_judino_drvo_working_hours), getString(R.string.club_judino_drvo_number)));
        nightClub.add(new Site(R.drawable.club_kauri, getString(R.string.club_kauri_name), getString(R.string.club_kauri_address), getString(R.string.club_kauri_working_hours), getString(R.string.club_kauri_number)));
        nightClub.add(new Site(R.drawable.club_quasimodo, getString(R.string.club_quasimodo_name), getString(R.string.club_quasimodo_address), getString(R.string.club_quasimodo_working_hours), getString(R.string.club_quasimodo_number)));
        nightClub.add(new Site(R.drawable.club_tropic, getString(R.string.club_tropic_name), getString(R.string.club_tropic_address), getString(R.string.club_tropic_working_hours), getString(R.string.club_tropic_number)));
        nightClub.add(new Site(R.drawable.club_vanilla, getString(R.string.club_vanilla_name), getString(R.string.club_vanilla_address), getString(R.string.club_vanilla_working_hours), getString(R.string.club_vanilla_number)));
        nightClub.add(new Site(R.drawable.club_velvet, getString(R.string.club_velvet_name), getString(R.string.club_velvet_address), getString(R.string.club_velvet_working_hours), getString(R.string.club_velvet_number)));
        nightClub.add(new Site(R.drawable.club_zenta, getString(R.string.club_zenta_name), getString(R.string.club_zenta_address), getString(R.string.club_zenta_working_hours), getString(R.string.club_zenta_number)));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), nightClub, R.color.colorNightClub);
        listView.setAdapter(adapter);

        return rootView;
    }
}
