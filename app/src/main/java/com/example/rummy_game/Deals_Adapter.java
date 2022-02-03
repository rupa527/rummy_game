package com.example.rummy_game;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Callback;


public class Deals_Adapter extends RecyclerView.Adapter<Deals_Adapter.MyViewHolder>{

    ArrayList<String> rummy_text_list;
    ArrayList<Integer> rummy_image_List;
    Context context;

    public Deals_Adapter(ArrayList<String> rummy_text_list, ArrayList<Integer> rummy_image_List, Deals context) {
        this.rummy_text_list = rummy_text_list;
        this.rummy_image_List = rummy_image_List;
        this.context = (Context) context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deals_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      //String rummyList = rummy_text_list.get(position);


// holder.imageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return rummy_text_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

       /* TextView category;
        TextView tags;
        TextView minBuyin;
        TextView amountType;
        TextView tableId;
        TextView tableName;
        TextView gameType;
        TextView isEnabled;
        TextView botsEnabled;
        TextView rakePct;
        TextView betValue;
        TextView numPlayers;
        TextView tableLimit;
        TextView maxBuyin;
        TextView bonusBetValue;
        TextView tableType;
        TextView tableCode;*/


        TextView rapid_winning;
        TextView deal_card;
        TextView bonus_percentage;
        ImageView giftbox;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            /*category = itemView.findViewById(R.id.category);
            tags = itemView.findViewById(R.id.tags);
            minBuyin = itemView.findViewById(R.id.minBuyin);
            amountType = itemView.findViewById(R.id.amountType);
            tableId = itemView.findViewById(R.id.tableId);
            tableName = itemView.findViewById(R.id.tableName);
            gameType = itemView.findViewById(R.id.gameType);
            isEnabled = itemView.findViewById(R.id.isEnabled);
            botsEnabled = itemView.findViewById(R.id.botsEnabled);
            rakePct = itemView.findViewById(R.id.rakePct);
            betValue = itemView.findViewById(R.id.betValue);
            numPlayers = itemView.findViewById(R.id.numPlayers);
            tableLimit = itemView.findViewById(R.id.tableLimit);
            maxBuyin = itemView.findViewById(R.id.maxBuyin);
            bonusBetValue = itemView.findViewById(R.id.bonusBetValue);
            tableType = itemView.findViewById(R.id.tableType);
            tableCode = itemView.findViewById(R.id.tableCode);*/
            
            rapid_winning = itemView.findViewById(R.id.text_rapid_winning);
            deal_card = itemView.findViewById(R.id.text_deal);
            bonus_percentage = itemView.findViewById(R.id.text_bonus_percentage_card);
            giftbox = itemView.findViewById(R.id.image_giftbox);
            cardView = itemView.findViewById(R.id.cardview);
        }
        }
    }


