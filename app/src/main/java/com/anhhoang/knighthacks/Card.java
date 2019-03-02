package com.anhhoang.knighthacks;

import android.graphics.Bitmap;

public class Card {
    private String name;
    private Bitmap imageViewCard;
    private int cardNum;

    public Card(String name, Bitmap sourceName, int cardNum)
    {
        this.name = name;
        this.imageViewCard = sourceName;
        this.cardNum = cardNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {

        return imageViewCard;
    }

    public void setImage(Bitmap image) {
        this.imageViewCard = image;

    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }


}
