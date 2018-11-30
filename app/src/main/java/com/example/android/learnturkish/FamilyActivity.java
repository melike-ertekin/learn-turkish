
package com.example.android.learnturkish;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create list of familyMembers words
        final ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("mother", "anne", R.drawable.family_mother, R.raw.family_mother));
        familyMembers.add(new Word("father", "baba", R.drawable.family_father, R.raw.family_father));
        //familyMembers.add(new Word("son","erkek cocuk", R.drawable.family_son));
        //familyMembers.add(new Word("daughter","kiz cocuk", R.drawable.family_daughter));
        familyMembers.add(new Word("older brother", "abi", R.drawable.family_older_brother, R.raw.family_olderbrother));
        //familyMembers.add(new Word("younger brother","erkek kardes",R.drawable.family_younger_brother));
        familyMembers.add(new Word("older sister","abla",R.drawable.family_older_sister, R.raw.family_oldersister));
        //familyMembers.add(new Word("younger sister", "kiz kardes",R.drawable.family_younger_sister));
        familyMembers.add(new Word("grandmother","buyukanne", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyMembers.add(new Word("grandfather", "buyukbaba", R.drawable.family_grandfather, R.raw.family_grandfather));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, familyMembers, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} I created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast.makeText(NumbersActivity.this, "list item clicked", Toast.LENGTH_SHORT).show();

                // Get the {@link Word} object at the given position the user clicked on
                Word familyMember = familyMembers.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, familyMember.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });


    }
}
