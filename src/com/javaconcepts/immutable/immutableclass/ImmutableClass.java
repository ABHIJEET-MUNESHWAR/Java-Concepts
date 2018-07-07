package com.javaconcepts.immutable.immutableclass;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 04/02/17
 * Time: 9:40 PM
 */
public final class ImmutableClass {

    private final int n;
    private final String name;
    private boolean isIt;

    public int getN() {
        return n;
    }

    public String getName() {
        return name;
    }

    public boolean isIt() {
        return isIt;
    }

    ImmutableClass(int num, String str, boolean bool) {
        n = num;
        name = str;
        isIt = bool;
    }
}
