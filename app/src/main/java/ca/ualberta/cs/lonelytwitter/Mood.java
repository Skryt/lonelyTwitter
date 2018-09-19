package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Skryt on 2018-09-18.
 */

public abstract class Mood {
    private Date date;
    private String mood;

    public Mood(String m) {
        mood = m;
        date = new Date();
    }

    public Mood(String m, Date d) {
        mood = m;
        date = d;
    }

    // Getters and setters for Date
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    // Getters and setters for Mood
    public String getMood() {
        return mood;
    }
    public void setMood(String mood) {
        this.mood = mood;
    }

}
