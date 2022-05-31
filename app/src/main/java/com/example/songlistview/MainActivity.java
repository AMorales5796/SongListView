package com.example.songlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView SongList;
    String[] songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SongList = findViewById(R.id.SongList);
        //songs = new DateFormatSymbols;
        DoublyLL Songs = new DoublyLL();
        Songs.push(1);
        Songs.pushAtEnd(2);
        Songs.pushAtEnd(3);
        Songs.push(4);


        DLLToArray =  Songs.toArray();

        ArrayAdapter<String> songAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, songs);
        SongList.setAdapter(songAdapter);
        SongList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        String song = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), "Clicked: " + song, Toast.LENGTH_SHORT).show();
    }
}