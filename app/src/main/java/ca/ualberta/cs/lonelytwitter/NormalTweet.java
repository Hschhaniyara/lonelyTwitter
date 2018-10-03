/**
 * class to set normal tweet
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 * @see Tweet
 */

package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {
    NormalTweet() {
        super();
    }

    NormalTweet(String message) {
        super(message);
    }

    @Override
    /**
     * @returns false
     */
    public Boolean isImportant() {
        return false;
    }
}
