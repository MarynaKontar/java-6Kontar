package Arithmetics;

/**
 Java#6
 * Module 1 Home work 2
 * Write class named Arithmetic with a method named add that takes integers as parameters
 * and returns an integer denoting their sum.
 * Write class named Adder that inherits from a superclass named Arithmetic.
 * Also class Adder must contain method check that compare two numbers and
 * returns true if a>=b and false in other cases.
 * Methods signature:
 * int add(Integer a, Integer b)
 * boolean check(Integer a, Integer b)
 * @author Kontar Maryna
 */
public class SolutionArithmetic {
    public static void main(String[] args) {

        int a = 3;
        int b = -456567;
        Arithmetic ar1 = new Arithmetic();
        System.out.println(ar1.add(a,-567));

        Adder ar2 = new Adder();
        System.out.println(ar2.add(-4556667, a));
        System.out.println(ar2.check(b, a));
    }
}
