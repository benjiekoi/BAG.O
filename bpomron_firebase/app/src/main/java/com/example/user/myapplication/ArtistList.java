package com.example.user.myapplication;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 3/8/2018.
 */

public class ArtistList extends ArrayAdapter<Artist> {

    private Activity context;
    private List<Artist> artistList;

    public ArtistList(Activity context, List<Artist>artistList){
        super(context,R.layout.list_layout,artistList);
        this.context = context;
        this.artistList = artistList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);

        Artist artist = artistList.get(position);

        textViewName.setText(artist.getBpdata());

        return listViewItem;
    }
}
