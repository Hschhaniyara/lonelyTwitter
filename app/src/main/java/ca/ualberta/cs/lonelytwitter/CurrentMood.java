package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;
/**
 * Created by chhaniya on 9/18/18.
 */

public abstract class CurrentMood {

    private Date date;
    ArrayList<CurrentMood> moodArrayList = new ArrayList<CurrentMood>();

    CurrentMood() {
        this.date = new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {return this.date;}

    public abstract String mood();
}

