package com.example.rummy_game;

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


public class Deals_Adapter extends RecyclerView.Adapter<Deals_Adapter.MyViewHolder>{

    ArrayList<String> rummy_text_list;
    ArrayList<Integer> rummy_image_List;
    Context context;

    public Deals_Adapter(ArrayList<String> rummy_text_list, ArrayList<Integer> rummy_image_List, Context context) {
        this.rummy_text_list = rummy_text_list;
        this.rummy_image_List = rummy_image_List;
        this.context = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deals_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return rummy_text_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView rapid_winning;
        TextView deal_card;
        TextView bonus_percentage;
        ImageView giftbox;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rapid_winning = itemView.findViewById(R.id.text_rapid_winning);
            deal_card = itemView.findViewById(R.id.text_deal);
            bonus_percentage = itemView.findViewById(R.id.text_bonus_percentage_card);
            giftbox = itemView.findViewById(R.id.image_giftbox);
            cardView = itemView.findViewById(R.id.cardview);
        }
        }
    }


