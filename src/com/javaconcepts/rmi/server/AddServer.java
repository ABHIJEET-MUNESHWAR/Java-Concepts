package com.javaconcepts.rmi.server;

import java.rmi.Naming;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 11:14 PM
 */
public class AddServer {
    public static void main(String[] args) {
        try{
            AddServerInterface addService = new Adder();
            Naming.rebind("AddService", addService);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
