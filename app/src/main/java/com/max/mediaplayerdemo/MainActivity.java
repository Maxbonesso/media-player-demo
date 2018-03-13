package com.max.mediaplayerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Hypnotize", "System of a Down", R.raw.hypnotizee));
        arrayList.add(new Music("Holy Mountains", "System of a Down", R.raw.holy_mountains));
        arrayList.add(new Music("Lonely Day", "System of a Down", R.raw.lonely_day));
        arrayList.add(new Music("Soldier Side", "System of a Down", R.raw.soldier_side));

        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
