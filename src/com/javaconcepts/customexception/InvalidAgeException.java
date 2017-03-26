package com.javaconcepts.customexception;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 26/03/17
 * Time: 10:52 PM
 */
public class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}
