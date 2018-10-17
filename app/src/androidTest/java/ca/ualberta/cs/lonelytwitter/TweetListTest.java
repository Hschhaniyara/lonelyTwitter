package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    // JUnit test methods for adding tweet into TweetList
    public void testAdd() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");

        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    // JUnit test method for checking whether a tweet is in the TweetList
    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        Tweet retrivedTweet = tweetList.getTweet(0);

        assertEquals(retrivedTweet.getMessage(),tweet.getMessage());
        assertEquals(retrivedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("one for delete");

        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testGetCount() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("one for count");
        assertEquals(tweetList.getCount(),0);
        tweetList.add(tweet);
        assertEquals(tweetList.getCount(),1);
        tweetList.add(tweet);
        assertEquals(tweetList.getCount(),2);
        tweetList.delete(tweet);
        assertEquals(tweetList.getCount(),1);
    }

    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");

        tweetList.addTweet(tweet);
        assertTrue(tweetList.hasTweet(tweet));
        try {
            tweetList.addTweet(tweet);
        } catch (IllegalArgumentException e) {
            assertTrue(Boolean.TRUE);
        }
    }

    public void testGetTweets() {
        TweetList tweetList = new TweetList();
        Tweet tweet1 = new NormalTweet("c tweet");
        Tweet tweet2 = new NormalTweet("a tweet");

        tweetList.addTweet(tweet1);
        tweetList.addTweet(tweet2);

        ArrayList<Tweet> t = tweetList.getTweets();

        assertEquals(t.get(0).getMessage(),tweet2.getMessage());
        assertEquals(t.get(0).getDate(), tweet2.getDate());

        assertEquals(t.get(1).getMessage(),tweet1.getMessage());
        assertEquals(t.get(1).getDate(), tweet1.getDate());

    }

}