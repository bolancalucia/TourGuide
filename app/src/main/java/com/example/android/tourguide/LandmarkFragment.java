package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarkFragment extends Fragment {

    public LandmarkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        ArrayList<Site> landmark = new ArrayList<>();
        landmark.add(new Site(R.drawable.landmark_diocletian_palace, getString(R.string.landmark_diocletian_palace_name), getString(R.string.landmark_diocletian_palace_description)));
        landmark.add(new Site(R.drawable.landmark_grgur_ninski, getString(R.string.landmark_grgur_ninski_name), getString(R.string.landmark_grgur_ninski_description)));
        landmark.add(new Site(R.drawable.landmark_let_me_pass_street, getString(R.string.landmark_let_me_pass_street_name), getString(R.string.landmark_let_me_pass_street_description)));
        landmark.add(new Site(R.drawable.landmark_poljud, getString(R.string.landmark_poljud_name), getString(R.string.landmark_poljud_description)));
        landmark.add(new Site(R.drawable.landmark_prokurative, getString(R.string.landmark_prokurative_name), getString(R.string.landmark_prokurative_description)));
        landmark.add(new Site(R.drawable.landmark_riva, getString(R.string.landmark_riva_name), getString(R.string.landmark_riva_description)));
        landmark.add(new Site(R.drawable.landmark_split_national_theater, getString(R.string.landmark_split_national_theater_name), getString(R.string.landmark_split_national_theater_description)));
        landmark.add(new Site(R.drawable.landmark_st_duje_cathedral, getString(R.string.landmark_st_duje_cathedral_name), getString(R.string.landmark_st_duje_cathedral_description)));

        ListView listView = rootView.findViewById(R.id.list_view);
        SiteAdapter adapter = new SiteAdapter(getActivity(), landmark, R.color.colorLandmark);
        listView.setAdapter(adapter);

        return rootView;
    }
}
