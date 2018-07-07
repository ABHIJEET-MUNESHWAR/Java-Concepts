package com.javaconcepts.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 4:13 PM
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        try{
            FileInputStream fileIn = new FileInputStream("src/com/javaconcepts/serialization/employee.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            e = (Employee) objIn.readObject();
            objIn.close();
            fileIn.close();
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + e.name);
            System.out.println("Address: " + e.address);
            System.out.println("SSN: " + e.SSN);
            System.out.println("Number: " + e.number);
        } catch(IOException i) {
            i.printStackTrace();
        } catch(ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
    }
}
