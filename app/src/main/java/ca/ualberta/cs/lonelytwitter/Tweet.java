/*
 *  * Copyright (c) Austin Goebel, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Constructs Tweet objects
 * @author Austin Goebel
 * @see ImportantTweet
 * @see NormalTweet
 * */

public abstract class Tweet implements Tweetable {

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;


    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() { return this.date; }

    //No method body implemented! We leave that up to the subclasses (they MUST implement it)
    public abstract Boolean isImportant();

    public String toString(){
        return this.date.toString()+" | "+this.message;

    }
}
