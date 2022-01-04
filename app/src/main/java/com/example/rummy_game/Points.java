package com.example.rummy_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Points extends AppCompatActivity {

    TextView txt_rummy, txt_how_to_play,txt_cash_games,txt_tournaments, txt_special_cont,
            txt_deals, txt_points, txt_pool;
    ImageView img_back_btn, img_wallet,img_rummy_banner,img_deals, img_points, img_pool, img_red_bar1,
            img_red_bar2, img_red_bar3;
    RecyclerView points_recyclerview;
    ArrayList<String> points_text_list = new ArrayList<>();
    ArrayList<Integer> points_image_List = new ArrayList<>();
    Points_Adapter points_adapter;
    Context mActivityContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        mActivityContext = this;

        txt_rummy = findViewById(R.id.text_rummy);
        txt_how_to_play = findViewById(R.id.text_how_to_play);
        txt_cash_games = findViewById(R.id.text_cash_games);
        txt_tournaments = findViewById(R.id.text_tournaments);
        txt_special_cont = findViewById(R.id.text_special_cont);
        txt_deals = findViewById(R.id.text_deals);
        txt_points = findViewById(R.id.text_points);
        txt_pool = findViewById(R.id.text_pool_101);
        points_recyclerview = findViewById(R.id.points_recyclerview);

        img_back_btn = findViewById(R.id.image_back_btn);
        img_wallet = findViewById(R.id.image_wallet_pools);
        img_rummy_banner = findViewById(R.id.image_rummy_banner);
        img_deals = findViewById(R.id.image_deals);
        img_points = findViewById(R.id.image_points);
        img_pool = findViewById(R.id.image_pool);
        img_red_bar1 = findViewById(R.id.image_high_light_bar1);
        img_red_bar2 = findViewById(R.id.image_high_light_bar2);
        img_red_bar3 = findViewById(R.id.image_high_light_bar3);

        Intent intnt_deals = new Intent(Points.this,Deals.class);

        Intent intnt_pools = new Intent(Points.this,Pools.class);

        txt_cash_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_cash_games.setTextColor(mActivityContext.getResources().getColor(R.color.white));
                txt_tournaments.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white));
                txt_tournaments.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_tournaments.setBackground(mActivityContext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white));
                txt_special_cont.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_special_cont.setBackground(mActivityContext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_cash_games.setBackground(mActivityContext.getResources().getDrawable(R.drawable.red_rectangle));
            }
        });

        txt_tournaments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_tournaments.setBackgroundColor(mActivityContext.getResources().getColor(R.color.red));
                txt_tournaments.setBackground(mActivityContext.getResources().getDrawable(R.drawable.red_rectangle));
                txt_tournaments.setTextColor(mActivityContext.getResources().getColor(R.color.white));
                txt_cash_games.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white));
                txt_cash_games.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_cash_games.setBackground(mActivityContext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white));
                txt_special_cont.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_special_cont.setBackground(mActivityContext.getResources().getDrawable(R.drawable.gray_rectangle));
            }
        });

        txt_special_cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_special_cont.setBackgroundColor(mActivityContext.getResources().getColor(R.color.red));
                txt_special_cont.setTextColor(mActivityContext.getResources().getColor(R.color.white));
                txt_cash_games.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white));
                txt_cash_games.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_cash_games.setBackground(mActivityContext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_tournaments.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white));
                txt_tournaments.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_tournaments.setBackground(mActivityContext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont.setBackground(mActivityContext.getResources().getDrawable(R.drawable.red_rectangle));
            }
        });

        img_deals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_deals.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_points.setTextColor(mActivityContext.getResources().getColor(R.color.grey));
                txt_pool.setTextColor(mActivityContext.getResources().getColor(R.color.grey));
                img_red_bar1.setVisibility(View.VISIBLE);
                img_red_bar2.setVisibility(View.GONE);
                img_red_bar3.setVisibility(View.GONE);

                startActivity(intnt_deals);

            }
        });

        img_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_points.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_pool.setTextColor(mActivityContext.getResources().getColor(R.color.grey));
                txt_deals.setTextColor(mActivityContext.getResources().getColor(R.color.grey));
                img_red_bar2.setVisibility(View.VISIBLE);
                img_red_bar1.setVisibility(View.GONE);
                img_red_bar3.setVisibility(View.GONE);

            }
        });

        img_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_pool.setTextColor(mActivityContext.getResources().getColor(R.color.black));
                txt_deals.setTextColor(mActivityContext.getResources().getColor(R.color.grey));
                txt_points.setTextColor(mActivityContext.getResources().getColor(R.color.grey));
                img_red_bar3.setVisibility(View.VISIBLE);
                img_red_bar2.setVisibility(View.GONE);
                img_red_bar1.setVisibility(View.GONE);

                startActivity(intnt_pools);

            }
        });

        points_text_list.add("text_bonus_table");
        points_text_list.add("text_point_value");
        points_text_list.add("text_bonus_percentage");

        points_image_List.add(R.id.image_gift_box);

        points_adapter = new Points_Adapter(points_text_list, points_image_List,this);
        points_recyclerview.setLayoutManager(new LinearLayoutManager(Points.this));
        points_recyclerview.setHasFixedSize(true);
        points_recyclerview.setLayoutManager(new LinearLayoutManager(mActivityContext));
        points_recyclerview.setAdapter(points_adapter);

    }
}

