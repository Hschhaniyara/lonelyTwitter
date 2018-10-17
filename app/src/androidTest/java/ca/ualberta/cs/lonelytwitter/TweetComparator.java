package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

public class TweetComparator implements Comparator<Tweet> {
    public int compare(Tweet left, Tweet right) {
        return left.getMessage().compareTo(right.getMessage());
    }
}
