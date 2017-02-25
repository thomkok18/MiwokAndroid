package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus?"));
        words.add(new Word("What is your name?", "tinnə oyaase'nə"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michəksəs?"));
        words.add(new Word("I'm feeling good.", "kuchi achit"));
        words.add(new Word("Are you comming?", "əənəs'aa?"));
        words.add(new Word("Yes, I'm comming.", "həə' əənəm"));
        words.add(new Word("I'm comming.", "əənəm"));
        words.add(new Word("Let's go.", "yoowutis"));
        words.add(new Word("Come here.", "ənni'nem"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.phraseslist);
        listView.setAdapter(adapter);
    }
}
