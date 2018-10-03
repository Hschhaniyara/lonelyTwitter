/**
 * class to express sad mood
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 * @see CurrentMood
 */

package ca.ualberta.cs.lonelytwitter;

public class SadMood extends CurrentMood {

    private String mood = "Sad";    // sets string mood to sad

    SadMood() {
        super();
    }

    public String mood() {
        return mood;
    }   // returns the string mood
}
