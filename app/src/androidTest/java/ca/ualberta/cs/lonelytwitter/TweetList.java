package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet (int index) {
        return tweets.get(index);
    }

    public void addTweet(Tweet tweet) throws  IllegalArgumentException {
        if (hasTweet(tweet)) {
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public ArrayList<Tweet> getTweets() {
        Collections.sort(tweets, new TweetComparator());
        return tweets;
    }

    public void delete (Tweet tweet) {
        tweets.remove(tweet);
    }

    public int getCount() {
        return tweets.size();
    }

}

