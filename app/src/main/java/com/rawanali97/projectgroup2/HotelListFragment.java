package com.rawanali97.projectgroup2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rawanali97.projectgroup2.model.Hotel;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelListFragment extends Fragment {

    public HotelListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // CaptionedImagesAdapter adapter = new CaptionedImagesAdapter();

        View rootView = inflater.inflate(R.layout.activity_main, container, false);
        //get Reference to the list
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.hottel_recycler);
        //data to desplay
        Hotel hotel=new Hotel();
        Hotel[] hotels=hotel.getHotels();
        String[] captions = new String[hotels.length];
        int[] ids = new int[hotels.length];
        // -- create an adapter
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return rootView;



    }
}
