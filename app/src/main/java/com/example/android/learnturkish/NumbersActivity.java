package com.example.android.learnturkish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "bir", R.drawable.number_one));
        words.add(new Word("two", "iki", R.drawable.number_two));
        words.add(new Word("three","üç", R.drawable.number_three));
        words.add(new Word("four","dört", R.drawable.number_four));
        words.add(new Word("five", "beş", R.drawable.number_five));
        words.add(new Word("six","altı", R.drawable.number_six));
        words.add(new Word("seven","yedi", R.drawable.number_seven));
        words.add(new Word("eight","sekiz", R.drawable.number_eight));
        words.add(new Word("nine", "dokuz", R.drawable.number_nine));
        words.add(new Word("ten", "on", R.drawable.number_ten));

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
