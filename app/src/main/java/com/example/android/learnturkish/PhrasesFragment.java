package com.example.android.learnturkish;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class PhrasesFragment extends Fragment {

    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);

        // Create list of familyMembers words
        ArrayList<Word> phrases = new ArrayList<Word>();

        phrases.add(new Word("What is your name?", "Senin adin ne?"));
        phrases.add(new Word("My name is...", "Benim adim..."));
        phrases.add(new Word("How are you?", "Nasilsin?"));
        phrases.add(new Word("I am good.", "iyiyim."));
        phrases.add(new Word("Where are you going?", "Nereye gidiyorsun?"));
        phrases.add(new Word("How old are you?", "Kac yasindasin"));
        phrases.add(new Word("I am ... years old.", "Ben ... yasindayim."));
        phrases.add(new Word("Let’s go.", "Hadi gidelim."));
        phrases.add(new Word("Come here.", "Buraya gel."));
        phrases.add(new Word("I love you.", "Seni seviyorum."));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), phrases, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} I created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;
    }


}
