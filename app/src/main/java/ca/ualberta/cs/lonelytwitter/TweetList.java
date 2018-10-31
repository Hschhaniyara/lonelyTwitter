package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    // fixed declaration for tweets
    private ArrayList<Tweet> Tweets = new ArrayList<Tweet>();

    public TweetList() {

    }
    // fixed implementaion for getTweet
    public Tweet getTweet(int index){

        return Tweets.get(index);
    }
    // fixed implementaion for hasTweet
    public boolean hasTweet(Tweet Tweet){

        return Tweets.contains(Tweet);
    }
    // fixed implementaion for add
    public void add(Tweet Tweet) {

        Tweets.add(Tweet);
    }
    // fixed implementaion for delete
    public void delete(Tweet Tweet) {

        Tweets.remove(Tweet);
    }
}
