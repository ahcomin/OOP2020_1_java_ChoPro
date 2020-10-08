package OOP7;

import java.util.Scanner;

public class DimensionConverterDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in inches : ");
        double inches = keyboard.nextDouble();
        double feet = DimensionConverter.convertInchesToFeet(inches);
        System.out.println(inches + " inches = " + feet + " feet.");

        feet = keyboard.nextDouble();
        inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println(feet + " feet = " + inches + " inches.");
    }
}