package com.rawanali97.projectgroup2;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class   CaptionedImagesAdapter
        extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
  //Can implement one array from hotel type
    private String [] captions;
    private int [] imagIds;
    //private String [] details;
    public CaptionedImagesAdapter(String[] captions, int[] imagIds) {
        this.captions = captions;
        this.imagIds = imagIds;
    }

    public void setCaptions(String[] captions) {
        this.captions = captions;
    }

    public int[] getImagIds() {
        return imagIds;
    }

    public void setImagIds(int[] imagIds) {
        this.imagIds = imagIds;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v =(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_img,parent,false);

        return new ViewHolder(v);
    }//to build card view

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imagIds[position]);

        imageView.setImageDrawable(dr);
        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(captions[position]);


        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent intent =new intent ();
            }
        });


    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public  static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
         public ViewHolder (CardView cardView){
             super(cardView);
             this.cardView =cardView;
         }


    }
}
