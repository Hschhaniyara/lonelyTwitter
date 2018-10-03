/**
 * class to set important tweet
 * Created by chhaniya on 9/18/18.
 * @author Harshal
 * @see Tweet
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

    //Empty argument constructor with default values
    ImportantTweet() {
        //Call the parent constructor to: avoid duplication!
        super();
    }

    ImportantTweet(String message) {
        super(message);
    }

    @Override
    /**
     * @returns true
     */
    public Boolean isImportant() {
        return true;
    }
}
