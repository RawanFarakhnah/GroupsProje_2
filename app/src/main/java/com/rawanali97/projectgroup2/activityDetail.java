package com.rawanali97.projectgroup2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class activityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);


        detailFragment frag =(detailFragment) getSupportFragmentManager().findFragmentById(R.id.frag_Id);
        Intent intent=getIntent();
        int id= (int) intent.getExtras().get("item_id");
        frag.setId(id);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
