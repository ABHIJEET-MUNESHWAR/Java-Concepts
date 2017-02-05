package com.javaconcepts.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 11:11 PM
 */
public class Adder extends UnicastRemoteObject implements AddServerInterface {
    Adder() throws RemoteException {
        super();
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
