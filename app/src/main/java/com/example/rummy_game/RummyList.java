package com.example.rummy_game;

import com.example.rummy_game.model.SerializedName;

import java.util.ArrayList;

public class RummyList {


    @SerializedName("tableId")
    private String mTableId;
    @SerializedName("tableType")
    private String mTableType;
    @SerializedName("tableName")
    private String mTableName;
    @SerializedName("tableLimit")
    private int  mTableLimit;
    @SerializedName("minBuyin")
    private Float mMinBuyIn;
    @SerializedName("maxBuyin")
    private Float mMaxBuyIn;
    @SerializedName("betValue")
    private Float mBetValue;
    @SerializedName("numPlayers")
    private int mNumOfPlayers;
    @SerializedName("category")
    private String mCategory;
    @SerializedName("bonusBetValue")
    private float mMaxBonus;
    @SerializedName("rakePct")
    private float mRakePercent;
    @SerializedName("tags")
    private ArrayList<String> tags;

    public RummyList(String mTableId, String mTableType, String mTableName, int mTableLimit,
                     Float mMinBuyIn, Float mMaxBuyIn, Float mBetValue, int mNumOfPlayers, String mCategory,
                     float mMaxBonus, float mRakePercent, ArrayList<String> tags) {
        this.mTableId = mTableId;
        this.mTableType = mTableType;
        this.mTableName = mTableName;
        this.mTableLimit = mTableLimit;
        this.mMinBuyIn = mMinBuyIn;
        this.mMaxBuyIn = mMaxBuyIn;
        this.mBetValue = mBetValue;
        this.mNumOfPlayers = mNumOfPlayers;
        this.mCategory = mCategory;
        this.mMaxBonus = mMaxBonus;
        this.mRakePercent = mRakePercent;
        this.tags = tags;
    }

    public String getmTableId() {
        return mTableId;
    }

    public void setmTableId(String mTableId) {
        this.mTableId = mTableId;
    }

    public String getmTableType() {
        return mTableType;
    }

    public void setmTableType(String mTableType) {
        this.mTableType = mTableType;
    }

    public String getmTableName() {
        return mTableName;
    }

    public void setmTableName(String mTableName) {
        this.mTableName = mTableName;
    }

    public int getmTableLimit() {
        return mTableLimit;
    }

    public void setmTableLimit(int mTableLimit) {
        this.mTableLimit = mTableLimit;
    }

    public Float getmMinBuyIn() {
        return mMinBuyIn;
    }

    public void setmMinBuyIn(Float mMinBuyIn) {
        this.mMinBuyIn = mMinBuyIn;
    }

    public Float getmMaxBuyIn() {
        return mMaxBuyIn;
    }

    public void setmMaxBuyIn(Float mMaxBuyIn) {
        this.mMaxBuyIn = mMaxBuyIn;
    }

    public Float getmBetValue() {
        return mBetValue;
    }

    public void setmBetValue(Float mBetValue) {
        this.mBetValue = mBetValue;
    }

    public int getmNumOfPlayers() {
        return mNumOfPlayers;
    }

    public void setmNumOfPlayers(int mNumOfPlayers) {
        this.mNumOfPlayers = mNumOfPlayers;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    public float getmMaxBonus() {
        return mMaxBonus;
    }

    public void setmMaxBonus(float mMaxBonus) {
        this.mMaxBonus = mMaxBonus;
    }

    public float getmRakePercent() {
        return mRakePercent;
    }

    public void setmRakePercent(float mRakePercent) {
        this.mRakePercent = mRakePercent;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}
