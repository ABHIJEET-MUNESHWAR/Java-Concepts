package com.javaconcepts.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 4:06 PM
 */
public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Abhijeet";
        e.address = "Kalyan Nagar";
        e.number = 101;
        e.SSN = 11122333;
        try {
            FileOutputStream fileOut = new FileOutputStream("src/com/javaconcepts/serialization/employee.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(e);
            objectOut.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in src/com/javaconcepts/serialization/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
