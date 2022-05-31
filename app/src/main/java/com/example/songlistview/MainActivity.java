package com.example.songlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView SongList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SongList = findViewById(R.id.SongList);
        //songs = new DateFormatSymbols;
        DoublyLL Songs = new DoublyLL();
        Songs.push("American Boy by Estelle ft Kyan West");
        Songs.pushAtEnd("Everybody Wants to Rule the World by Tears for Fears");
        Songs.pushAtEnd("Riptide by Vance Joy");
        Songs.push("Nothing Else Matters by Metallica");
        Songs.push("Got to Be Real by Cheryl Lynn");
        Songs.pushAtEnd("Let's Groove by Earth Wind & Fire");
        Songs.push("You Are The Reason by Calum Scott");
        Songs.push("Papercut by Linkin Park");
        Songs.push("Fly Me To The Moon by Frank Sinatra");
        Songs.push("My Cherie Amour by Stevie Wonder");
        Songs.push("Counting Stars by OneRepublic");
        Songs.push("Heaven Is a Place on Earth by Belinda Carlisle");


        String[] DLLToArray =  Songs.toArray();

        ArrayAdapter<String> songAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, DLLToArray);
        SongList.setAdapter(songAdapter);
        SongList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        String song = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), "Clicked: " + song, Toast.LENGTH_SHORT).show();
    }
}