package com.example.android.learnturkish;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        // Create list of color words
        final ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "kırmızı", R.drawable.color_red, R.raw.color_red));
        colors.add(new Word("green", "yeşil", R.drawable.color_green, R.raw.color_green));
        colors.add(new Word("brown","kahverengi", R.drawable.color_brown, R.raw.color_brown));
        colors.add(new Word("gray","gri", R.drawable.color_gray, R.raw.color_gray));
        colors.add(new Word("black", "siyah", R.drawable.color_black, R.raw.color_black));
        colors.add(new Word("white","beyaz", R.drawable.color_white, R.raw.color_white));
        colors.add(new Word("yellow","sarı", R.drawable.color_mustard_yellow, R.raw.color_yellow));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} I created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Release the media player if it currently exists because we are about to
                // play a different sound file
                releaseMediaPlayer();
                // Toast.makeText(NumbersActivity.this, "list item clicked", Toast.LENGTH_SHORT).show();

                // Get the {@link Word} object at the given position the user clicked on
                Word color = colors.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, color.getAudioResourceId());

                // Start the audio file
                mMediaPlayer.start();
            }
        });


    }


    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {


        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
