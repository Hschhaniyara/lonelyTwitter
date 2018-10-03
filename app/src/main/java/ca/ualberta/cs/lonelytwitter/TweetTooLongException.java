/**
 * class handles the exception if tweet is too long
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 * @see Exception
 */
package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

    /**
     * shows message if tweet is long than max
     */
    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
