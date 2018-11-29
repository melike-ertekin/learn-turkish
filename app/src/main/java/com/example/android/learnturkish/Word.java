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
}
