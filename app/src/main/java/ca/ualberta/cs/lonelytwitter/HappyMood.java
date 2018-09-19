package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.Mood;

/**
 * Created by Skryt on 2018-09-18.
 */

public class HappyMood extends Mood {
    public HappyMood(String m) {
        super(m);
    }

    public HappyMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public String getMood(){
        return super.getMood();
    }
}