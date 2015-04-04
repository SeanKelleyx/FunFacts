package com.sean.funfacts.model;

/**
 * Created by SeanKelley on 4/4/15.
 */
public class MasterDataObject {
    private FactBook mFactBook;
    private ColorWheel mColorWheel;

    public MasterDataObject(){
        mFactBook = new FactBook();
        mColorWheel = new ColorWheel();
    }

    public int getColor(){
        return mColorWheel.getColor();
    }

    public String getFact(){
        return mFactBook.getFact();
    }
}
