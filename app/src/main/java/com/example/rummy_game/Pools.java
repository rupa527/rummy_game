package com.example.rummy_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Pools extends AppCompatActivity {

    TextView txt_pools_rummy, txt_how_to_play_pools, txt_cash_games_pools, txt_tournaments_pools,
            txt_special_cont_pools, txt_deals, txt_points, txt_pool_101;

    ImageView img_back_btn_pools, img_wallet_pools, img_rummy_banner_pools,
            img_deals_pools, img_points, img_pool, img_bar1_pools,
            img_bar2_pools, img_bar3_pools;

    RecyclerView pools_recyclerview;

    Context mActivitycontext;

    ArrayList<String> pools_text_list = new ArrayList<>();
    ArrayList<Integer> pools_image_list = new ArrayList<>();
    Pools_Adapter pools_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pools);

        mActivitycontext = this;

        txt_pools_rummy = findViewById(R.id.text_pools_rummy);
        txt_how_to_play_pools= findViewById(R.id.text_how_to_play_pools);
        txt_cash_games_pools = findViewById(R.id.text_cash_games_pools);
        txt_tournaments_pools = findViewById(R.id.text_tournaments_pools);
        txt_special_cont_pools = findViewById(R.id.text_special_cont_pools);
        txt_deals = findViewById(R.id.text_deals);
        txt_points = findViewById(R.id.text_points);
        txt_pool_101 = findViewById(R.id.text_pool_101);

        img_back_btn_pools = findViewById(R.id.image_back_btn_pools);
        img_wallet_pools = findViewById(R.id.image_wallet_pools);
        img_rummy_banner_pools = findViewById(R.id.image_rummy_banner_pools);
        img_deals_pools = findViewById(R.id.image_deals_pools);
        img_points = findViewById(R.id.image_points);
        img_pool = findViewById(R.id.image_pool);
        img_bar1_pools = findViewById(R.id.image_high_light_bar1);
        img_bar2_pools = findViewById(R.id.image_high_light_bar2);
        img_bar3_pools = findViewById(R.id.image_high_light_bar3);
        pools_recyclerview = findViewById(R.id.pools_recyclerview);

        Intent intnt_deals = new Intent(Pools.this,Deals.class);

        Intent intnt_points = new Intent(Pools.this,Points.class);

        txt_cash_games_pools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_cash_games_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_tournaments_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_tournaments_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_tournaments_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_special_cont_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_special_cont_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_cash_games_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.red_rectangle));

            }
        });

        txt_tournaments_pools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_tournaments_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.red));
                txt_tournaments_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.red_rectangle));
                txt_tournaments_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_cash_games_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_special_cont_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_special_cont_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));


            }
        });

        txt_special_cont_pools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_special_cont_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.red));
                txt_special_cont_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_cash_games_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_cash_games_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_tournaments_pools.setBackgroundColor(mActivitycontext.getResources().getColor(R.color.white));
                txt_tournaments_pools.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_tournaments_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.gray_rectangle));
                txt_special_cont_pools.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.red_rectangle));

            }
        });

        img_deals_pools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_deals.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_points.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                txt_pool_101.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                img_bar1_pools.setVisibility(View.VISIBLE);
                img_bar2_pools.setVisibility(View.GONE);
                img_bar3_pools.setVisibility(View.GONE);

                startActivity(intnt_deals);

            }
        });

        img_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_points.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_pool_101.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                txt_deals.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                img_bar2_pools.setVisibility(View.VISIBLE);
                img_bar1_pools.setVisibility(View.GONE);
                img_bar3_pools.setVisibility(View.GONE);

                startActivity(intnt_points);

            }
        });

        img_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_pool_101.setTextColor(mActivitycontext.getResources().getColor(R.color.black));
                txt_deals.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                txt_points.setTextColor(mActivitycontext.getResources().getColor(R.color.grey));
                img_bar3_pools.setVisibility(View.VISIBLE);
                img_bar2_pools.setVisibility(View.GONE);
                img_bar1_pools.setVisibility(View.GONE);

            }
        });

        pools_text_list.add("text_bonus_table");
        pools_text_list.add("text_winning_amount");
        pools_text_list.add("text_play");

        pools_image_list.add(R.id.image_gift_box_pools);

        pools_adapter = new Pools_Adapter(pools_text_list,pools_image_list,this);
        pools_recyclerview.setLayoutManager(new LinearLayoutManager(Pools.this));
        pools_recyclerview.setHasFixedSize(true);
        pools_recyclerview.setLayoutManager(new LinearLayoutManager(mActivitycontext));
        pools_recyclerview.setAdapter(pools_adapter);

    }
}




