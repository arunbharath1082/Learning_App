package com.example.ownlanguage;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("அப்பா","Father"));
        words.add(new Word("அம்மா","Mother"));
        words.add(new Word("தாத்தா","Grandfather"));
        words.add(new Word("பாட்டி","Grandmother"));
        words.add(new Word("கொள்ளுத் தாத்தா","Great Grandfather"));
        words.add(new Word("கொள்ளுப் பாட்டி","Great Grandmother"));
        words.add(new Word("கணவன் அல்லது மனைவி","Spouse"));
        words.add(new Word("அண்ணன் , தம்பி , அக்கா , தங்கை","Siblings"));
        words.add(new Word("சகோதரன்","Brother"));
        words.add(new Word("அண்ணன்","Elder brother"));
        words.add(new Word("தம்பி","Younger brother"));
        words.add(new Word("சகோதரி ","Sister"));

        words.add(new Word("அக்கா","Elder sister"));
        words.add(new Word("தங்கை","Younger sister"));
        words.add(new Word("அண்ணி","Elder brother's wife"));
        words.add(new Word("மாமா (தாய் மாமா )","Maternal Uncle"));
        words.add(new Word("பெரியப்பா , சித்தப்பா","Paternal Uncle"));
        words.add(new Word("அத்தை , சித்தி , மாமி , பெரியம்மா","Aunty"));
        words.add(new Word("கணவர்","Husband"));
        words.add(new Word("மனைவி","Wife"));
        words.add(new Word("மாமியார்","Mother-in-law"));
        words.add(new Word("மாமனார்","Father-in-law"));
        words.add(new Word("கணவரின் or மனைவியின் - அண்ணன் , தம்பி","Brother-in-law"));
        words.add(new Word("கணவரின் or மனைவியின் -அக்கா , தங்கை ","Sister -in-law"));

        words.add(new Word("கணவரின் சகோதரரின் மனைவி","Co-sister"));
        words.add(new Word("மனைவியின் சகோதரியின் கணவர் ","Co-Brother"));
        words.add(new Word("மருமகன்","Son-in-law"));
        words.add(new Word("மருமகள்","Daughter-in-law"));
        words.add(new Word("மகன்","Son"));
        words.add(new Word("மகள்","Daughter"));
        words.add(new Word("பேரன்","Grand son"));
        words.add(new Word("பேத்தி","Grand daughter"));
        words.add(new Word("கொள்ளுப் பேரன்","Great Grand son"));
        words.add(new Word("கொள்ளுப் பேத்தி","Great Grand daughter"));
        words.add(new Word("சம்பந்தி","son's , daughter's in-laws"));
        words.add(new Word("அண்ணன் , தம்பி , அக்காள் , தங்கை - இவர்களின் மகன்","Nephew"));

        words.add(new Word("அண்ணன் , தம்பி , அக்காள் , தங்கை - இவர்களின் மகள்","Niece"));
        words.add(new Word("அத்தை , மாமா - இவர்களின் மகன் , மகள்","Cousin"));
        words.add(new Word("பெரியப்பா , சித்தப்பா மகன்","Cousin Brother"));
        words.add(new Word("பெரியப்பா , சித்தப்பா மகள்","Cousin Sister"));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}