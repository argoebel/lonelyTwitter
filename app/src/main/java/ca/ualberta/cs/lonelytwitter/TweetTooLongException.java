/*
 *  * Copyright (c) Austin Goebel, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 */

package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception {

    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
