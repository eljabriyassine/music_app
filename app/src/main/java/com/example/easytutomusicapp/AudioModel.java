package com.example.easytutomusicapp;

import java.io.Serializable;

/**
 * Represents an audio model with its path, title, and duration.
 */
public class AudioModel implements Serializable {

    String path;
    String title;
    String duration;

    /**
     * Constructs an AudioModel object with the specified path, title, and duration.
     *
     * @param path     The path of the audio file.
     * @param title    The title of the audio file.
     * @param duration The duration of the audio file.
     */
    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
    }

    /**
     * Returns the path of the audio file.
     *
     * @return The path of the audio file.
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the path of the audio file.
     *
     * @param path The path of the audio file.
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Returns the title of the audio file.
     *
     * @return The title of the audio file.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the audio file.
     *
     * @param title The title of the audio file.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Returns the duration of the audio file.
     *
     * @return The duration of the audio file.
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the duration of the audio file.
     *
     * @param duration The duration of the audio file.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
}

