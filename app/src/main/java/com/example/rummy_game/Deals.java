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
import android.widget.Toast;

import com.example.rummy_game.model.JSONPlaceHolder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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


        Intent intnt_points = new Intent(Deals.this,Points.class);//launch points

        Intent intnt_pools = new Intent(Deals.this,Pools.class);//launch pools

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.peka.ooo")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        JSONPlaceHolder jsonPlaceholder = retrofit.create(JSONPlaceHolder.class);
        Call<List<RummyList>> call = jsonPlaceholder.getRummyList("xnm2ox7ajlek", "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyIjp7ImlkIjoyMjM1LCJ1c2VybmFtZSI6Im5hbWUiLCJzaXRlLWlkIjoxLCJ1dWlkIjoiNzdjZTQ5OWItYWQ5YS00ZTA0LTg1ZDUtMzQyOGQ1OTdmMjYxIn0sImV4cCI6MTY0NTY4NTk0Mn0.7qORoa8IFOBQhNwat7onqUYesDljuVFhCQEHiwsqWzc","0.0", "0.0", "rummy");
        //System.out.println("Call - " + call.request().url().toString());

        call.enqueue(new Callback<List<RummyList>>() {
            @Override
            public void onResponse(Call<List<RummyList>> call, Response<List<RummyList>> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(Deals.this, "success", Toast.LENGTH_SHORT).show();
                    //Log.d(List<RummyList>.toString);
                    return;

                }
            }

            @Override
            public void onFailure(Call<List<RummyList>> call, Throwable t) {
                Toast.makeText(Deals.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

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

        deals_adapter = new Deals_Adapter(rummy_text_list,rummy_image_List,  this);
        deals_recyclerview.setLayoutManager(new LinearLayoutManager(Deals.this));
        deals_recyclerview.setHasFixedSize(true);
        deals_recyclerview.setLayoutManager(new LinearLayoutManager(mActivitycontext));
        deals_recyclerview.setAdapter(deals_adapter);



    }
}

/*
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.peka.ooo/")
                .client(getUnsafeOkHttpClient().build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JSONPlaceholder jsonPlaceholder = retrofit.create(JSONPlaceholder.class);
        Call<List<JoshLobbyCardListResponseData>> call = jsonPlaceholder.getRummyTables( "0.0", "0.0", "rummy");
        System.out.println("Call - " + call.request().url().toString());
        call.enqueue(new Callback<List<JoshLobbyCardListResponseData>>() {
            @Override
            public void onResponse(Call<List<JoshLobbyCardListResponseData>> call, Response<List<JoshLobbyCardListResponseData>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(Rummy_Api.this, response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }
                List<JoshLobbyCardListResponseData> joshLobbyCardListResponseDataList = response.body();
                TablesAdapter tablesAdapter = new TablesAdapter(Rummy_Api.this, joshLobbyCardListResponseDataList);
                recyclerView.setAdapter(tablesAdapter);

            }

            @Override
            public void onFailure(Call<List<JoshLobbyCardListResponseData>> call, Throwable t) {

                Toast.makeText(Rummy_Api.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });*/
