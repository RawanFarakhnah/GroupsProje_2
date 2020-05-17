package com.rawanali97.projectgroup2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rawanali97.projectgroup2.model.Hotel;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        if(hotelList.toString() == "[]"){
            addDefaultData();
            saveData();
        }




        //test comment
        RecyclerView recycler = (RecyclerView)findViewById(R.id.hottel_recycler);
        String[] captions = new String[Hotel.hotels.length];
        int[] ids = new int[Hotel.hotels.length];

        /*
        for(int i = 0; i<captions.length;i++){
            captions[i] = Hotel.hotel[i].getName();
            ids[i] = Hotel.hotel[i].getImg_id();
        }
         */

        for(int i = 0; i < hotelList.size(); i++){
            captions[i] = hotelList.get(i).getName();
            ids[i] = hotelList.get(i).getImg_id();
        }




        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }

    public void addDefaultData(){
        hotelList.add( new Hotel("Hilton Pyramids Golf",R.drawable.hilton_pyramids_golf));
        hotelList.add( new Hotel("Makkah Hotel", R.drawable.makkah_hotel));
        hotelList.add( new Hotel("Hotel Hilton Alexandria",R.drawable.hotel_hilton_alexandria));
        hotelList.add(new Hotel("Oriental Rivoli Hotel",R.drawable.oriental_rivoli_hotel));
        hotelList.add(new Hotel("Raffles Makkah Palace",R.drawable.raffles_makkah_palace));
        hotelList.add(new Hotel( "The Westin Cairo Gol", R.drawable.the_westin_cairo_gol));
        hotelList.add(new Hotel( "Sonesta Cairo Hotel", R.drawable.sonesta_cairo_hotel));
        hotelList.add(new Hotel( "Sharm El Sheikh Marriott Resort",R.drawable.sharm_el_sheikh_marriott_resort));
    }

    private void saveData(){
        loadData();
        SharedPreferences s = getSharedPreferences("HOTELS", MODE_PRIVATE);
        SharedPreferences.Editor editor = s.edit();
        Gson gson = new Gson();
        String json = gson.toJson(hotelList);
        editor.putString("hotellist", json);
        editor.apply();

    }


    private void loadData() {
        SharedPreferences s = getSharedPreferences("HOTELS", MODE_PRIVATE);
        Gson gson = new Gson();
        String json = s.getString("hotellist", null);
        Type type = new TypeToken<ArrayList<Hotel>>() {
        }.getType();
        if (gson.fromJson(json, type) != null) {
            ArrayList<Hotel> load = gson.fromJson(json, type);
            hotelList = load;
        }





    }

    private void print(String msg) {
        Toast.makeText(getApplicationContext(), msg,
                Toast.LENGTH_LONG).show();
    }


}
