package com.rawanali97.projectgroup2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);


        detailFragment frag =(detailFragment) getSupportFragmentManager().findFragmentById(R.id.frag_Id);
        Intent intent=getIntent();
        int id= (int) intent.getExtras().get("ID");
        frag.setId(id);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
