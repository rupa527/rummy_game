package com.example.rummy_game.model;

import com.example.rummy_game.RummyList;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface JSONPlaceHolder {


    @GET("/api/tables")
    Call<List<RummyList>> getRummyList(@Header("X-Application") String serverApiKeys,
                                       @Header("Authorization") String loginAuthToken,
                                       @Query("lat") String currentLatitude,
                                       @Query("long") String currentLongitude,
                                       @Query("gameType") String gameType);

}
