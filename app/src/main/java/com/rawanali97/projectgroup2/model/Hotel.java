package com.rawanali97.projectgroup2.model;

import com.rawanali97.projectgroup2.R;

public class Hotel {
    private String name;
    private int Img_id;

    public static final Hotel [] hotel = {

      new Hotel("Hilton Pyramids Golf",R.drawable.hilton_pyramids_golf),
      new Hotel("Makkah Hotel", R.drawable.makkah_hotel),
      new Hotel("Hotel Hilton Alexandria",R.drawable.hotel_hilton_alexandria),
      new Hotel("Oriental Rivoli Hotel",R.drawable.oriental_rivoli_hotel),
      new Hotel("Raffles Makkah Palace",R.drawable.raffles_makkah_palace),
      new Hotel( "The Westin Cairo Gol", R.drawable.the_westin_cairo_gol),
      new Hotel( "Sonesta Cairo Hotel", R.drawable.sonesta_cairo_hotel),
      new Hotel( "Sharm El Sheikh Marriott Resort",R.drawable.sharm_el_sheikh_marriott_resort)
    };


    public Hotel(String name, int img_id) {
        this.name = name;
        Img_id = img_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg_id() {
        return Img_id;
    }

    public void setImg_id(int img_id) {
        Img_id = img_id;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", Img_id=" + Img_id +
                '}';
    }
}
