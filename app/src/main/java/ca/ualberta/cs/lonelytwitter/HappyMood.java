/**
 * class to express happy mood
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 * @see CurrentMood
 */

package ca.ualberta.cs.lonelytwitter;

public class HappyMood extends CurrentMood {

    private String mood = "Happy"; // sets string mood to happy

    HappyMood() {
        super();
    }

    public String mood() {
        return mood;
    }   // returns the string mood
}
