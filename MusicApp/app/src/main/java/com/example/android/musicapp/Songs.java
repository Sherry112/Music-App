package com.example.android.musicapp;

public class Songs {
    private String mSongName;
    private String mArtistName;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Songs(String songName, String artistName, int imageResourceId, int audioResourceId) {
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public Songs(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {

        return mArtistName;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }


    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
