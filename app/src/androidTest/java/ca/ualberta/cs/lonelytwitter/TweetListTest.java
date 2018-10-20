package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){super(LonelyTwitterActivity.class);}

    public void testAddTweet(){

        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        
    }

    public void testDeleteTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testHasTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        Tweet tweet2 = new NormalTweet("Tweet2");
        tweets.addTweet(tweet);


        Boolean containtsTweetTrue = true;

        Boolean containsTweet = tweets.hasTweet(tweet);
        Boolean containsTweet2 = tweets.hasTweet(tweet2);


        assertEquals(containtsTweetTrue, containsTweet);
        assertFalse(containsTweet2);

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        tweets.addTweet(tweet);
        Integer expectedCount = 1;

        Integer count = tweets.getCount();

        assertEquals(expectedCount, count);

        Tweet tweet2 = new NormalTweet("Tweet2");
        tweets.addTweet(tweet2);
        expectedCount = 2;

        count = tweets.getCount();

        assertEquals(expectedCount, count);

    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Tweet");
        Tweet tweet2 = new NormalTweet("Tweet2");
        tweets.addTweet(tweet);
        tweets.addTweet(tweet2);

        ArrayList<Tweet> returnedTweets = tweets.getTweets();

        assertEquals(tweets, returnedTweets);
    }



}
