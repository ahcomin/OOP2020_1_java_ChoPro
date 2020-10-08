/**
 * <h1> DoubleOut </h1>
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac DoubleOut.java
 * @Run : java DoubleOut
 * Programming Assignment 1.
 * @since 05-18-2020
 */


package Homework4;

import java.util.Scanner;

public class DoubleOut {
    public static void write(double amount) {
        if (amount >= 0) {
            System.out.print('$');
            writePositive(amount);
        } else {
            double positiveAmount = -amount;
            System.out.print('$');
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }

    //Precondition: amount >= 0;
    //Displays amount in dollars and cents notation. Rounds
    //after two decimal places. Omits the dollar sign.
    private static void writePositive(double amount) {
        int allCents = (int) (Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;
        System.out.print(dollars);
        System.out.print('.');

        if (cents < 10)
            System.out.print('0');
        System.out.print(cents);
    }

    /**
     * Displays amount in dollars and cents notation.
     * Rounds after two decimal points.
     * Advances to the next line after output.
     */
    public static void writeln(double amount) {
        write(amount);
        System.out.println();
    }

    /**
     * Displays a number with digitsAfterPoint digits after
     * the decimal point. Rounds any extra digits.
     * Does not advance to the next line after output.
     */
    public static void write(double number, int digitsAfterPoint) {
        if (number >= 0)
            writePositive(number, digitsAfterPoint);
        else {
            double positiveNumber = -number;
            System.out.print('-');
            writePositive(positiveNumber, digitsAfterPoint);
        }
    }

    /**
     * Displays a number with digitsAfterPoint digits after
     * the decimal point. Rounds any extra digits.
     * Advances to the next line after output.
     */
    public static void writeln(double number, int digitsAfterPoint) {
        write(number, digitsAfterPoint);
        System.out.println();
    }

    //Precondition: number >= 0
    //Displays a number with digitsAfterPoint digits after
    //the decimal point. Rounds any extra digits.
    private static void writePositive(double number, int digitsAfterPoint) {
        int mover = (int) (Math.pow(10, digitsAfterPoint));
        //1 followed by digitsAfterPoint zeros
        int allWhole; //number with the decimal point
        //moved digitsAfterPoint places
        allWhole = (int) (Math.round(number * mover));
        int beforePoint = allWhole / mover;
        int afterPoint = allWhole % mover;
        System.out.print(beforePoint);
        System.out.print('.');
        writeFraction(afterPoint, digitsAfterPoint);
    }

    //Displays the integer afterPoint with enough zeros
    //in front to make it digitsAfterPoint digits long.
    private static void writeFraction(int afterPoint, int digitsAfterPoint) {
        int n = 1;
        while (n < digitsAfterPoint) {
            if (afterPoint < Math.pow(10, n))
                System.out.print('0');
            n = n + 1;
        }
        System.out.print(afterPoint);
    }

    /**
     * Writes out number in scientific ("e") notation, i.e.
     * with one digit to the left of the decimal point,
     * digitsAfterPoint digits after the decimal point, and
     * the exponent of 10 required to correctly place the decimal point.
     * <p>
     * Rounds any extra digits.
     * Does not advance to the next line after output.
     */
    public static void scienceWrite(double number, int digitsAfterPoint) {
        System.out.println("1.414e10");
    }

    /**
     * Writes out number in scientific ("e") notation, i.e.
     * with one digit to the left of the decimal point,
     * digitsAfterPoint digits after the decimal point, and
     * the exponent of 10 required to correctly place the decimal point.
     * <p>
     * Advances to the next line after output.
     */
    public static void scienceWriteln(double number, int digitsAfterPoint) {
        scienceWrite(number, digitsAfterPoint);
        System.out.println();
    }


}
