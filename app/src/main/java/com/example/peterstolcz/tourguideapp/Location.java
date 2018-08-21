package com.example.peterstolcz.tourguideapp;

public class Location {

    private String mTitle;

    private String mExplanation;

    private String mLocation;

    private Integer mImageResouceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String Title, String Explanation, String Location, Integer ImageResouceID) {
        mTitle = Title;
        mExplanation = Explanation;
        mLocation = Location;
        mImageResouceId = ImageResouceID;

    }

    public String getTitle() {
        return mTitle;
    }

    public String getExplanation() {
        return mExplanation;
    }

    public String getLocation() {
        return mLocation;
    }

    public Integer getImageResouceId() {
        return mImageResouceId;
    }

    public boolean hasImage() {
        return mImageResouceId != NO_IMAGE_PROVIDED;

    }
}
