package com.example.ownlanguage;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("சிவப்பு","Red",R.drawable.color_red));
        words.add(new Word("மஞ்சள்","Yellow",R.drawable.color_mustard_yellow));
        words.add(new Word("பச்சை","Green",R.drawable.color_green));
        words.add(new Word("வெள்ளை","White",R.drawable.color_white));
        words.add(new Word("சாம்பல்","Gray",R.drawable.color_gray));
        words.add(new Word("பழுப்பு","Brown",R.drawable.color_brown));
        words.add(new Word("கருப்பு","Black",R.drawable.color_black));


        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}