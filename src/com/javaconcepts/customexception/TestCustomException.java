package com.javaconcepts.customexception;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 26/03/17
 * Time: 10:54 PM
 * http://www.javatpoint.com/custom-exception
 */

public class TestCustomException {

    private void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        TestCustomException customException = new TestCustomException();
        try {
            customException.validate(15);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
