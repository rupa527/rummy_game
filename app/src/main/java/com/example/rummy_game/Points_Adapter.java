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

public class Points_Adapter extends RecyclerView.Adapter<Points_Adapter.ViewHolder> {

    ArrayList<String> points_text_list;
    ArrayList<Integer> points_image_List;
    Context context;

    public Points_Adapter(ArrayList<String> points_text_list, ArrayList<Integer> points_image_List, Context context) {
        this.points_text_list = points_text_list;
        this.points_image_List = points_image_List;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.points_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return points_text_list.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView practice_game;
        TextView point_value;
        TextView bonus_percentage;
        ImageView gift_box;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            practice_game = itemView.findViewById(R.id.text_practice_game);
            point_value = itemView.findViewById(R.id.text_point_value);
            bonus_percentage = itemView.findViewById(R.id.text_bonus_percentage);
            gift_box = itemView.findViewById(R.id.image_giftbox);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}
