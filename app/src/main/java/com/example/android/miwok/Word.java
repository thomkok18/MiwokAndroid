package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageRecourceId;

    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageRecourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageRecourceId = imageRecourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageRecourceId() {
        return mImageRecourceId;
    }
}