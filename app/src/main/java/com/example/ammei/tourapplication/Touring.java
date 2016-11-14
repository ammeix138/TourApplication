package com.example.ammei.tourapplication;

/**
 * Created by ammei on 11/9/2016.
 */

/*
 *This class has stored my resource Id's for both the name of the destinations as well as the
 *descriptions for each destination.
 */

public class Touring {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE = -1;
    /**
     * Will store the name of the destination
     */
    private String mTitleOfContent;
    /**
     * Will store the description for each destination the app displays.
     */
    private String mDescriptionOfContent;
    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE;

    /*Touring Constructor.
     *
     *@param titleOfContent is the name of the destination.
     *
     *@param descriptionOfContent is the description of the destination.
     */
    public Touring(String titleOfContent, String descriptionOfContent) {
        mTitleOfContent = titleOfContent;
        mDescriptionOfContent = descriptionOfContent;
    }

    /**
     * Create a new Word object.
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Touring(String titleOfContent, String descriptionOfContent, int imageResourceId) {
        mTitleOfContent = titleOfContent;
        mDescriptionOfContent = descriptionOfContent;
        mImageResourceId = imageResourceId;
    }

    /*
     * Gets and returns the name of the destinations
     */
    public String getTitleOfContent() {
        return mTitleOfContent;
    }

    /**
     * Gets and returns the description for each destination.
     */
    public String getDescriptionOfContent() {
        return mDescriptionOfContent;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

}
