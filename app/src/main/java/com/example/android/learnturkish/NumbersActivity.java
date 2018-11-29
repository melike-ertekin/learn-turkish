package com.example.android.learnturkish;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_activity);

        // Create list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "bir"));
        words.add(new Word("two", "iki"));
        words.add(new Word("three","üç"));
        words.add(new Word("four","dört"));
        words.add(new Word("five", "beş"));
        words.add(new Word("six","altı"));
        words.add(new Word("seven","yedi"));
        words.add(new Word("eight","sekiz"));
        words.add(new Word("nine", "dokuz"));
        words.add(new Word("ten", "on"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} I created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);




    }
}
