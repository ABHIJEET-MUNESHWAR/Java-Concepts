package com.javaconcepts.serialization;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 2:04 PM
 */

import java.io.Serializable;
public class Employee implements Serializable{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("Mailing a check to " + name + ", " + address);
    }
}
