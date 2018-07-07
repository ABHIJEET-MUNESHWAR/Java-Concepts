package com.javaconcepts.ObjectsComparison;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 19/03/17
 * Time: 9:58 AM
 */
public class CompareObjects {
    String str;

    CompareObjects() {
        str = "21334";
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompareObjects)) {
            return false;
        }
        CompareObjects that = (CompareObjects) other;

        return (this.str.equals(that.str));
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = hashCode * 37 + hashCode();
        return hashCode;
    }

    public static void main(String[] args) {
        CompareObjects obj1 = new CompareObjects();
        CompareObjects obj2 = new CompareObjects();
        if (obj1 == obj2) {
            System.out.println("==");
        }
        if (obj1.equals(obj2)) {
            System.out.println("equals");
        }
    }
}
