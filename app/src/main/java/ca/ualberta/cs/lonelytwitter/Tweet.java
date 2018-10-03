/**
 * abstract class has general info on tweet
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 * @see Tweetable
 * @see TweetTooLongException
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;   // max length of tweet

    /** Empty argument constructor with default values */
    Tweet() {
        //Must use the 'this' keyword in order to specify the current object message = message does nothing!
        this.date = new Date();
        this.message = "I am default message schwa!";
    }

   /** Overloading: so that we can specify the tweet content */
    Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

    /** gets message for tweet
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * sets message as long as message is less than max size
     * @param message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() { return this.date; }

    //No method body implemented! We leave that up to the subclasses (they MUST implement it)
    public abstract Boolean isImportant();

    @Override
    /** returns the message  */
    public String toString() {
        return this.getMessage();
    }

}
