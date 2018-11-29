package com.example.android.learnturkish;
/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a turkish translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Turkish translation for the word */
    private String mTurkishTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param turkishTranslation is the word in the Turkish language
     *
     * @param ImageResourceId is the resource ID of image for the word.
     */
    public Word(String defaultTranslation, String turkishTranslation, int ImageResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mTurkishTranslation = turkishTranslation;
        this.mImageResourceId =  ImageResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param turkishTranslation is the word in the Turkish language
     */
    public Word(String defaultTranslation, String turkishTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mTurkishTranslation = turkishTranslation;

    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Turkish translation of the word.
     */
    public String getTurkishTranslation() {
        return mTurkishTranslation;
    }

    /**
     * Get the Image resource ID of the word.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
