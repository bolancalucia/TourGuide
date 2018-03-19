package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;

public class Site extends AppCompatActivity {

    private final String DEFAULT_SIZE = "-1";
    private int mImageResourceId;
    private String mName;
    private String mAddress = DEFAULT_SIZE;
    private String mTelephoneNumber = DEFAULT_SIZE;
    private String mWorkingHours = DEFAULT_SIZE;
    private String mDescription = DEFAULT_SIZE;

    public Site(int imageResourceId, String name, String description) {
        mImageResourceId = imageResourceId;
        mName = name;
        mDescription = description;
    }

    public Site(String name, int imageResourceId, String address) {
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
    }

    public Site(int imageResourceId, String name, String address, String telephoneNumber) {
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mTelephoneNumber = telephoneNumber;
    }

    public Site(int imageResourceId, String name, String address, String workingHours, String telephoneNumber) {
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mWorkingHours = workingHours;
        mTelephoneNumber = telephoneNumber;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getTelephoneNumber() {
        return mTelephoneNumber;
    }

    public String getWorkingHours() {
        return mWorkingHours;
    }

    public String getDescription() {
        return mDescription;
    }

    public boolean hasAddress() {
        return !mAddress.equals(DEFAULT_SIZE);
    }

    public boolean hasNumber() {
        return !mTelephoneNumber.equals(DEFAULT_SIZE);
    }

    public boolean hasHours() {
        return !mWorkingHours.equals(DEFAULT_SIZE);
    }

    public boolean hasDescription() {
        return !mDescription.equals(DEFAULT_SIZE);
    }

    @Override
    public String toString() {
        return "Site{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mWorkingHours='" + mWorkingHours + '\'' +
                ", mTelephoneNumber='" + mTelephoneNumber + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
