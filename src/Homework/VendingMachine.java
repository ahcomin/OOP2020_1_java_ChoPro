/**
 * <h1> Vending Machine</h1>
 * When you buy something that price is 1 dollar
 * This program will calculate how many can you get the change.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Programming Assignment 1.
 * @since 04-10-2020
 */

package Homework; //name of package.

import java.util.Scanner; //import java.util for using  Scanner.

public class VendingMachine { //class declaration.

    public static void main(String[] args) { //main method is defined here.

        Scanner kb = new Scanner(System.in); //kb is the instance of the scanner class.

        System.out.println("Enter price of item"); //for notifying what the user to do
        System.out.println("(from 25 cents to a dollar, in 5-cent increments):");

        //variable declaration.
        int amount; //It is declared at integer. amount means amount of money payed by the user
        int exchange; // It is declared at integer. 거스름돈
        int quarters, dimes, nickels, pennies; //It is declared at integer. each means 25 cent, 10 cent, 5 cent, 1 cent

        amount = kb.nextInt(); //read a entered sentence by user

        exchange = 100 - amount; //It is a change on the assumption that the price of an item is one dollar.


        quarters = exchange / 25; // Calculate how many 25 cents come out.
        exchange = exchange % 25; // put the rest of the numbers in exchange.


        dimes = exchange / 10; // and then calculate how many 10 cents come out.
        exchange = exchange % 10; // put the rest of the numbers in exchange.

        nickels = exchange / 5; // and then calculate how many 5 cents come out.
        exchange = exchange % 5; // put the rest of the numbers in exchange.

        pennies = exchange; //It don't need to calculate cuz it is 1 cent.

        System.out.println("you bought an item for 45 cents and gave me a dollar, so your change is ");
        System.out.println(quarters + " Quarters\n" + dimes + " Dimes, and\n" + nickels + " Nickels, and\n" + pennies + "Pennies"); //view to user the result of calculation.
    }
}
