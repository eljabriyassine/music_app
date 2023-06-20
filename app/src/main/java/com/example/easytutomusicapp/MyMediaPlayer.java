package com.example.easytutomusicapp;

import android.media.MediaPlayer;

/**
 * Singleton class for the MediaPlayer.
 */
public class MyMediaPlayer {
    static MediaPlayer instance;

    /**
     * Returns the instance of MediaPlayer.
     *
     * @return The MediaPlayer instance.
     */
    public static MediaPlayer getInstance() {
        if (instance == null) {
            instance = new MediaPlayer();
        }
        return instance;
    }

    /**
     * Resets the MediaPlayer instance.
     */
    public void reset() {
        if (instance != null) {
            instance.reset();
        }
    }

    /**
     * Holds the index of the current song in the songs list.
     */
    public static int currentIndex = 0;
}

