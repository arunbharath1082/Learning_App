package com.example.ownlanguage;

import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("ஒன்று","One",R.drawable.number1));
        words.add(new Word("இரண்டு","Two",R.drawable.number2));
        words.add(new Word("மூன்று","Three",R.drawable.number3));
        words.add(new Word("நான்கு","Four",R.drawable.number4));
        words.add(new Word("ஐந்து","Five",R.drawable.number5));
        words.add(new Word("ஆறு","Six",R.drawable.number6));
        words.add(new Word("ஏழு","Seven",R.drawable.number7));
        words.add(new Word("எட்டு","Eight",R.drawable.number8));
        words.add(new Word("ஒன்பது","Nine",R.drawable.number9));
        words.add(new Word("பத்து","Ten",R.drawable.number10));


        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }


}