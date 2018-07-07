package com.javaconcepts.rmi.server;

import java.rmi.Remote;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 11:10 PM
 */
public interface AddServerInterface extends Remote {
    public int sum(int a, int b);
}
