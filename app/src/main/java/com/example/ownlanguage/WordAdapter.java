package com.example.ownlanguage;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int resourceId) {
        super(context, 0, words);
        colorResourceId = resourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentView = convertView;
        if (currentView == null) {
            currentView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWordPosition = getItem(position);
        TextView textView1 = (TextView) currentView.findViewById(R.id.list_text_view);
        textView1.setText(currentWordPosition.getEnglishTranslation());

        // then according to the position of the view assign the desired TextView 2 for the same
        TextView textView2 = (TextView) currentView.findViewById(R.id.default_text_view);
        textView2.setText(currentWordPosition.getDefaultTranslation());

        ImageView imgview = (ImageView) currentView.findViewById(R.id.img_view);

        if (currentWordPosition.hasImage()) {
            imgview.setImageResource(currentWordPosition.getImgResource());
            imgview.setVisibility(View.VISIBLE);
        } else {
            imgview.setVisibility(View.GONE);
        }

        View textcontainer = currentView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorResourceId);
        textcontainer.setBackgroundColor(color);

        return currentView;
    }
}
