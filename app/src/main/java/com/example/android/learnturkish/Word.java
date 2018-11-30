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

    /** Audio resource ID for the word */
    private int mAudioResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param turkishTranslation is the word in the Turkish language
     *
     * @param imageResourceId is the resource ID of image for the word.
     *
     * @param audioResourceId is the resource ID of audio for the word.
     */
    public Word(String defaultTranslation, String turkishTranslation, int imageResourceId, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mTurkishTranslation = turkishTranslation;
        this.mImageResourceId =  imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param turkishTranslation is the word in the Turkish language
     */
    public Word(String defaultTranslation, String turkishTranslation /*, int audioResourceId*/) {
        this.mDefaultTranslation = defaultTranslation;
        this.mTurkishTranslation = turkishTranslation;
       // this.mAudioResourceId = audioResourceId;
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

    /**
     * Get the Audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
