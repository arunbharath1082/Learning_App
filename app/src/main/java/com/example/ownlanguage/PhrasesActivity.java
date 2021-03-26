package com.example.ownlanguage;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("வாருங்கள்","Welcome"));
        words.add(new Word("வணக்கம்!","How are you?"));
        words.add(new Word("நன்றாக இருக்கின்றேன்","Reply to 'How are you?'"));
        words.add(new Word("உங்கள் பெயர் என்ன?","What's your name?"));
        words.add(new Word("கஉங்கள் சொந்த ஊர் எது?","Where are you from?"));
        words.add(new Word("என் சொந்த ஊர் சென்னை","I am from Chennai"));
        words.add(new Word("உங்களை பார்த்தது மிகவும் சந்தோஷம்","Nice to meet you"));
        words.add(new Word("காலை வணக்கம்","Good morning"));
        words.add(new Word("மதிய வணக்கம்","Good afternoon"));
        words.add(new Word("மாலை வணக்கம்","Good evening"));
        words.add(new Word("இரவு வணக்கம்","Good night"));
        words.add(new Word("போய் விட்டு வருகிறேன்","Goodbye"));

        words.add(new Word("நல்வாழ்த்துக்கள்","Good luck!"));
        words.add(new Word("நல் ஆரோக்கியம் பெருக","Cheers! Good Health!"));
        words.add(new Word("இந்த நாள் இனிய நாளாக அமையட்டும்","Have a nice day"));
        words.add(new Word("மகிழ்ந்து உண்ணுங்கள்","Have a nice meal"));
        words.add(new Word("இனிய பயணம் தொடரட்டும்","Have a good journey"));
        words.add(new Word("மெதுவாக பேசுங்கள்","Please speak more slowly"));
        words.add(new Word("திரும்ப சொல்லுங்கள்","Please say that again"));
        words.add(new Word("எழுதி கொள்ளுங்கள்","Please write it down"));
        words.add(new Word("நீங்கள் தமிழ் பேசுவீர்களா?","Do you speak Tamil?"));
        words.add(new Word("நீங்கள் உங்கள் சொந்த மொழி தவிர வேறு மொழி பேசுவீர்களா?","Do you speak a language other than Tamil?"));
        words.add(new Word("மன்னிக்க வேண்டும்","Excuse me"));
        words.add(new Word("இது எவ்வளவு","How much is this?"));

        words.add(new Word("என்னை மன்னிக்க வேண்டும்","Sorry"));
        words.add(new Word("நன்றி","Thank you"));
        words.add(new Word("குளியலறை எங்கே உள்ளது?","Where's the toilet / bathroom?"));
        words.add(new Word("நீங்கள் இங்கே அடிக்கடி வருகிறீர்களா?","Do you come here often?"));
        words.add(new Word("உங்கள் உடல் விரைவாக குணம் அடையட்டும்","Get well soon"));
        words.add(new Word("என்னை தனியாக இருக்க விடுங்கள்","Leave me alone!"));
        words.add(new Word("காப்பாற்றுங்கள்!","Help!"));
        words.add(new Word("நெருப்பு","Fire!"));
        words.add(new Word("நில்!","Stop!"));
        words.add(new Word("காவலர்களை அழையுங்கள்!","Call the police!"));
        words.add(new Word("கிறிஸ்துமஸ் மற்றும் இனிய புத்தாண்டு வாழ்த்துக்கள்","Happy Christmas / Happy New Year"));
        words.add(new Word("இனிய பிறந்த நாள் நல்வாழ்த்துக்கள்","Wish you many more happy returns of the day"));

        words.add(new Word("அப்ரம் பார்க்கலாம்","See you later!"));
        words.add(new Word("உங்களுக்கு எத்தனை வயசு?","How old are you?"));
        words.add(new Word("நான் போகணும்","I have to go."));
        words.add(new Word("பஒரு நிமிஷம்!","One moment please!"));
        words.add(new Word("எனக்கு ஒரு உதவி செய்ய முடியுமா?","Can you help me?"));
        words.add(new Word("எனக்கு வழி தெரியலே.","I'm lost."));
        words.add(new Word("என்னோடு வாங்க!","Come with me!"));
        words.add(new Word("எனக்குத் தெரியாது.","I Don't Know!"));
        words.add(new Word("எனக்குப் புரியலே.","I Don't Understand!"));
        words.add(new Word("ஒன்னும் ப்ரச்சினை இல்லை.","No Problem!"));
        words.add(new Word("கவலைப்படாதீங்க!","Don't worry!"));
        words.add(new Word("உனக்கு இது பிடிக்குதா?","Do you like it?"));

        words.add(new Word("இது என்ன?","What is this?"));
        words.add(new Word("இன்று / இப்போ / நாளை / நேற்று","Today/ Now / Tomorrow / Yesterday"));
        words.add(new Word("காலையில் / மாலையில் / ராத்ரியில்","In The Morning / In The Evening / At Night."));
        words.add(new Word("இப்போ மணி என்ன?","What time is it?"));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}