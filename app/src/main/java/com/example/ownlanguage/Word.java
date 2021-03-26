package com.example.ownlanguage;

public class Word {
    private String mDefaultTranslation;
    private String mEnglishTranslation;
    private int mImgResource = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String EnglishTranslation) {
        mDefaultTranslation = defaultTranslation;
        mEnglishTranslation = EnglishTranslation;
    }

    public Word(String defaultTranslation, String EnglishTranslation, int ImgResource) {
        mDefaultTranslation = defaultTranslation;
        mEnglishTranslation = EnglishTranslation;
        mImgResource = ImgResource;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public int getImgResource() {
        return mImgResource;
    }

    public boolean hasImage() {
        return mImgResource != NO_IMAGE_PROVIDED;
    }
}
