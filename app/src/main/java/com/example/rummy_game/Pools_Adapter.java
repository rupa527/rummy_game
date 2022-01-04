package com.example.rummy_game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Pools_Adapter extends RecyclerView.Adapter<Pools_Adapter.ViewHolder> {

    ArrayList<String> pools_text_list;
    ArrayList<Integer> pools_image_list;
    Context context;

    public Pools_Adapter(ArrayList<String> pools_text_list, ArrayList<Integer> pools_image_list, Context context) {
        this.pools_text_list = pools_text_list;
        this.pools_image_list = pools_image_list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pools_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return pools_text_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView bonus_table;
        TextView play;
        TextView winning_amount;
        ImageView gift_box;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            bonus_table = itemView.findViewById(R.id.text_bonus_table_pools);
            play = itemView.findViewById(R.id.text_play_pool);
            winning_amount = itemView.findViewById(R.id.text_winning_amount);
            gift_box = itemView.findViewById(R.id.image_gift_box_pools);
            cardView = itemView.findViewById(R.id.pools_card);

        }
    }
}
