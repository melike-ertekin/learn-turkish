
package com.example.android.learnturkish;

        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        // Create list of color words
        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("red", "kırmızı", R.drawable.color_red));
        colors.add(new Word("green", "yeşil", R.drawable.color_green));
        colors.add(new Word("brown","kahverengi", R.drawable.color_brown));
        colors.add(new Word("gray","gri", R.drawable.color_gray));
        colors.add(new Word("black", "siyah", R.drawable.color_black));
        colors.add(new Word("white","beyaz", R.drawable.color_white));
        colors.add(new Word("yellow","sarı", R.drawable.color_mustard_yellow));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} I created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);




    }
}
