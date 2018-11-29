
package com.example.android.learnturkish;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create list of familyMembers words
        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("What is your name?", "Senin adin ne?"));
        phrases.add(new Word("My name is...","Benim adim..."));
        phrases.add(new Word("How are you?","Nasilsin?"));
        phrases.add(new Word("I am good.", "iyiyim."));
        phrases.add(new Word("Where are you going?", "Nereye gidiyorsun?"));
        phrases.add(new Word("How old are you?","Kac yasindasin"));
        phrases.add(new Word("I am ... years old.","Ben ... yasindayim."));
        phrases.add(new Word("Let’s go.", "Hadi gidelim."));
        phrases.add(new Word("Come here.","Buraya gel."));
        phrases.add(new Word("I love you.", "Seni seviyorum."));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} I created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);




    }
}
