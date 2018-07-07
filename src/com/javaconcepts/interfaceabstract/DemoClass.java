package com.javaconcepts.interfaceabstract;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    22/06/18,
 * Time:    7:48 PM
 */
public class DemoClass extends AbstractDemo {

  @Override
  public void method2() {
    System.out.println("Hi from method2");
  }
  public static void main(String[] args){
    DemoClass demoClass = new DemoClass();
    demoClass.method1();
    demoClass.method2();
  }
}
