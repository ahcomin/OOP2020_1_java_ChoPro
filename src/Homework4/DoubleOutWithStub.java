package Homework4;

/**
 File Name: DoubleOutWithStub.java

 This program is an intermediate version of the final program
 and has only partial functionality, as described here:

 Outputs a floating point number (of type double)
 in three different formats (but one format is simulated with
 a stub program):
 (1) dollars and cents,
 (2) decimal value with the number of digits to the right of the
 decimal point specified, and
 (3) simulated "e" (scientific) notation: hard-coded to print
 the string "1.414e10".

 Based on: Dollars, Display 5.14, and OutputFormat, Self-Test
 Question 23.

 Modified by: Lew Rakocy
 email address: Lrakocy@devrycols.edu
 Date: 8/27/00
 Changes: 03/09/2003 Made comments like text examples.
 */
public class DoubleOutWithStub
{
    /**
     Outputs amount in dollars and cents notation. Rounds after two
     decimal points. Does not advance to the next line after output.
     */
    public static void write(double amount)
    {
        if (amount >= 0)
        {
            System.out.print('$');
            writePositive(amount);
        }
        else
        {
            double positiveAmount = -amount;
            System.out.print('$');
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }

    // Precondition: amount >= 0;
    // Outputs amount in dollars and cents notation. Rounds
    // after two decimal points. Omits the dollar sign.

    private static void writePositive(double amount)
    {
        int allCents = (int)(Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;

        System.out.print(dollars);
        System.out.print('.');

        if (cents < 10)
        {
            System.out.print('0');
            System.out.print(cents);
        }
        else
            System.out.print(cents);
    }

    /**
     Outputs amount in dollars and cents notation. Rounds after
     two decimal points. Advances to the next line after output.
     */
    public static void writeln(double amount)
    {
        write(amount);
        System.out.println();
    }

    // FORMAT SPECIFYING THE NUMBER OF DIGITS
    // AFTER THE DECIMAL POINT
    // Copied from OutputFormat (Self-Test Question 23).

    /**
     Writes out number with digitsAfterPoint digits after
     the decimal point. Round any extra digits.
     Does not advance to the next line after output.
     */
    private static void write(double number, int digitsAfterPoint)
    {
        if (number >= 0)
            writePositive(number, digitsAfterPoint);
        else
        {
            double positiveNumber = -number;
            System.out.print('-');
            writePositive(positiveNumber, digitsAfterPoint);
        }
    }

    // Precondition: number >= 0
    // Writes out number with digitsAfterPoint digits after the
    // decimal point. Rounds any extra digits.

    private static void writePositive(double number, int digitsAfterPoint)
    {
        int mover = (int)(Math.pow(10, digitsAfterPoint));
        // 1 followed by digitsAfterPoint zeros

        int allWhole;   // Number with the decimal point
        // moved digitsAfterPoint places.

        allWhole = (int)(Math.round(number*mover));
        int beforePoint = allWhole / mover;
        int afterPoint = allWhole % mover;

        System.out.print(beforePoint);
        System.out.print('.');
        writeFraction(afterPoint, digitsAfterPoint);
    }

    // Outputs the integer afterPoint with enough 0s
    // in front to make it digitsAfterPoint digits long.

    private static void writeFraction(int afterPoint, int digitsAfterPoint)
    {
        int n = 1;
        while (n < digitsAfterPoint)
        {
            if (afterPoint < Math.pow(10, n))
                System.out.print('0');

            n = n + 1;
        }

        System.out.print(afterPoint);
    }

    /**
     Writes out number with digitsAfterPoint digits after
     the decimal point. Rounds any extra digits.
     Advances to the next line after output.
     */
    public static void writeln(double number, int digitsAfterPoint)
    {
        write(number, digitsAfterPoint);
        System.out.println();
    }

    // E (SCIENTIFIC) NOTATION
    // New code, not copied from Dollars.java or OutputFormat.java;
    // it writes out in "e" (scientific) notation.

    // Interim solution: use this stub for the method scienceWrite.
    // When complete it will do the following:

    /**
     Writes out number in scientific ("e") notation, i.e.
     with one digit to the left of the decimal point,
     digitsAfterPoint digits after the decimal point, and
     the exponent of 10 required to correctly place the decimal point.

     Rounds any extra digits.
     Does not advance to the next line after output.
     */
    public static void scienceWrite(double number, int digitsAfterPoint)
    {
        System.out.println("1.414e10");
    }

    /**
     Writes out number in scientific ("e") notation, i.e.
     with one digit to the left of the decimal point,
     digitsAfterPoint digits after the decimal point, and
     the exponent of 10 required to correctly place the decimal point.

     Advances to the next line after output.
     */
    public static void scienceWriteln(double number, int digitsAfterPoint)
    {
        scienceWrite(number, digitsAfterPoint);
        System.out.println();
    }
}