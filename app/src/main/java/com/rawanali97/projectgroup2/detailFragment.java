package com.rawanali97.projectgroup2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rawanali97.projectgroup2.model.Hotel;


/**
 * A simple {@link Fragment} subclass.
 */
public class detailFragment extends Fragment {

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    public detailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view=getView();
        if(view!=null){
            TextView name=view.findViewById(R.id.Name);
            TextView info=view.findViewById(R.id.info);
            Hotel hotel=new Hotel();
            Hotel[] hotels=hotel.getHotels();
            name.setText(hotels[id].getName());
        }
    }
}
