package com.javaconcepts.rmi.client;


import java.rmi;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 11:16 PM
 */
public class Client {
    public static void main(String[] args) {
        try{
            AddServerInterface st = (AddServerInterface) Naming.lookup("rmi://"+args[0]+"/AddService");
            System.out.println(st.sum(2, 3));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
