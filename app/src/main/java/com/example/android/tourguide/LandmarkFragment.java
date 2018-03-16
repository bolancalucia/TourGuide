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
        landmark.add(new Site(R.drawable.landmark_diocletian_palace, "Diocletian's Palace", "One of the reasons why Split is popular."));
        landmark.add(new Site(R.drawable.landmark_grgur_ninski, "Grgur Ninski", "Statue with a famous toe"));
        landmark.add(new Site(R.drawable.landmark_let_me_pass_street, "Let me pass Street", "The narrowest street in the world"));
        landmark.add(new Site(R.drawable.landmark_poljud, "Stadium Poljud", "The city stadium, built in the 80s."));
        landmark.add(new Site(R.drawable.landmark_prokurative, "Prokurative", "Republic square where music festival occurs"));
        landmark.add(new Site(R.drawable.landmark_riva, "Riva promenade", "The most famous street in Split"));
        landmark.add(new Site(R.drawable.landmark_split_national_theater, "Split national theatre", "Old national theatre building"));
        landmark.add(new Site(R.drawable.landmark_st_duje_cathedral, "St Duje cathedral", "Cathedral of the Split's saint"));

        ListView listView = rootView.findViewById(R.id.list_view); // zasto ne  rootview.find--- a ne getActivity()
        SiteAdapter adapter = new SiteAdapter(getActivity(), landmark, R.color.colorLandmark);
        listView.setAdapter(adapter);

        return rootView;
    }
}
