package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ListViewResult_BP extends AppCompatActivity {
    DatabaseReference databaseArtist;
    ListView listViewArtists;

    List<Artist> artistList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_result__bp);

        databaseArtist = FirebaseDatabase.getInstance().getReference("bpResult");

        listViewArtists = (ListView)findViewById(R.id.listViewArtists);

        artistList = new ArrayList<>();
    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseArtist.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                artistList.clear();
                for (DataSnapshot artistSnapshot : dataSnapshot.getChildren()){
                    Artist artist = artistSnapshot.getValue(Artist.class);

                    artistList.add(artist);
                }

                ArtistList adapter = new ArtistList(ListViewResult_BP.this,artistList);
                listViewArtists.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
