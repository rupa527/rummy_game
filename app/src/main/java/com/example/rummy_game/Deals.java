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

public class Deals extends AppCompatActivity {

    TextView txt_rummy, txt_how_to_play, txt_cash_games, txt_tournaments, txt_special_cont,
            txt_deals, txt_points, txt_pool;
    ImageView img_back_btn, img_wallet, img_rummy_banner, img_deals, img_points, img_pool, img_red_bar1,
            img_red_bar2, img_red_bar3;
    RecyclerView deals_recyclerview;
    ArrayList<String> rummy_text_list = new ArrayList<>();
    ArrayList<Integer> rummy_image_List = new ArrayList<>();
    Deals_Adapter deals_adapter;
    Context mActivitycontext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deals);

        mActivitycontext = this;

        txt_rummy = findViewById(R.id.text_rummy);
        txt_how_to_play = findViewById(R.id.text_how_to_play);
        txt_cash_games = findViewById(R.id.text_cash_games);
        txt_tournaments = findViewById(R.id.text_tournaments);
        txt_special_cont = findViewById(R.id.text_special_cont);
        txt_deals = findViewById(R.id.text_deals);
        txt_points = findViewById(R.id.text_points);
        txt_pool = findViewById(R.id.text_pool_101);
        deals_recyclerview = findViewById(R.id.deals_recyclerview);

        img_back_btn = findViewById(R.id.image_back_btn);
        img_wallet = findViewById(R.id.image_wallet_deals);
        img_rummy_banner = findViewById(R.id.image_rummy_banner);
        img_deals = findViewById(R.id.image_deals);
        img_points = findViewById(R.id.image_points);
        img_pool = findViewById(R.id.image_pool);
        img_red_bar1 = findViewById(R.id.image_high_light_bar1);
        img_red_bar2 = findViewById(R.id.image_high_light_bar2);
        img_red_bar3 = findViewById(R.id.image_high_light_bar3);

        Intent intnt_points = new Intent(Deals.this,Points.class);

        Intent intnt_pools = new Intent(Deals.this,Pools.class);

        txt_cash_games.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_cash_games.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.red));
                txt_cash_games.setTextColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_tournaments.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_tournaments.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_tournaments.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_special_cont.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_special_cont.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_cash_games.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.red_rectangle));
            }
        });

        txt_tournaments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_tournaments.setTextColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_cash_games.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_special_cont.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_special_cont.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_tournaments.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.red_rectangle));

            }
        });

        txt_special_cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_special_cont.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.red));
                txt_special_cont.setTextColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_cash_games.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_tournaments.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_tournaments.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_tournaments.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.red_rectangle));
            }
        });

        img_deals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_deals.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_points.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                txt_pool.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                img_red_bar1.setVisibility(View.VISIBLE);
                img_red_bar2.setVisibility(View.GONE);
                img_red_bar3.setVisibility(View.GONE);

            }
        });

        img_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_points.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_pool.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                txt_deals.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                img_red_bar2.setVisibility(View.VISIBLE);
                img_red_bar1.setVisibility(View.GONE);
                img_red_bar3.setVisibility(View.GONE);

                startActivity(intnt_points);

            }
        });

        img_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_pool.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_deals.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                txt_points.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                img_red_bar3.setVisibility(View.VISIBLE);
                img_red_bar2.setVisibility(View.GONE);
                img_red_bar1.setVisibility(View.GONE);

                startActivity(intnt_pools);


            }
        });

        rummy_text_list.add("text_grand_cont_card");
        rummy_text_list.add("text_entry_fee_amount_card");
        rummy_text_list.add("text_bonus_percentage_card");
        rummy_text_list.add("text_1st_prize_card");

        rummy_image_List.add(R.id.image_giftbox);

        deals_adapter = new Deals_Adapter(rummy_text_list,rummy_image_List,this);
        deals_recyclerview.setLayoutManager(new LinearLayoutManager(Deals.this));
        deals_recyclerview.setHasFixedSize(true);
        deals_recyclerview.setLayoutManager(new LinearLayoutManager(mActivitycontext));
        deals_recyclerview.setAdapter(deals_adapter);



    }
}


