package com.example.android.musicapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Songs> {


    public SongAdapter(Context context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        // Get the {@link Song} object located at this position in the list
        Songs currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songName = listItemView.findViewById(R.id.song_name);

        songName.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name.
        TextView artistName = listItemView.findViewById(R.id.artist_name);

        artistName.setText(currentSong.getArtistName());

        ImageView imageResourcId= listItemView.findViewById(R.id.song_image);
        imageResourcId.setImageResource(currentSong.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
