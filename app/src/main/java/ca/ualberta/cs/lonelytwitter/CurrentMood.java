/**
 * abstract class has general info on current mood
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 */

package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

public abstract class CurrentMood {

    private Date date;
ArrayList<CurrentMood> moodArrayList = new ArrayList<CurrentMood>();    // array list with moods

    CurrentMood() {
        this.date = new Date();
    }
    /** this method sets date */
    public void setDate(Date date) {
        this.date = date;
    }
    /** this method gets date
     * @returns date
     */
    public Date getDate() {
        return this.date;
    }

    /** declaration of string which contains mood must be created by sub classes */
    public abstract String mood();
}

