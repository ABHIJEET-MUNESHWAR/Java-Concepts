package com.javaconcepts.extendsdemo;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 19/03/17
 * Time: 9:49 AM
 */
public class Child extends Parent {
    public void showMessage() {
        System.out.println("Hello from Child");
    }

    public void checkInheritance() {
        this.showMessage();
        super.showMessage();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.checkInheritance();
        Parent p1 = new Child();
        p1.showMessage();
    }
}
