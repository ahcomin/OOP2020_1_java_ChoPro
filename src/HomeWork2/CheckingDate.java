/**
 *<h1> Checking Date </h1>
 * code to read a date
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>

 * @Compile : javac CheckingDate.java
 * @Run : java CheckingDate
 * Programming Assignment 4.
 * @since 04-21-2020
 */

package HomeWork2;
//import scanner

import java.util.Scanner;

public class CheckingDate {//class definition

    public static void main(String arg[]) { //main method of the class
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a date in format mm/dd/yyyy to check");// read the date from user

        String date = keyboard.next();
        // divide the date with "/" delimeter
        String[] slash = date.split("/");
        // find month from date
        int month = Integer.parseInt(slash[0]);
        // find day from date
        int day = Integer.parseInt(slash[1]);
        // find year from date
        int year = Integer.parseInt(slash[2]);

        boolean calendar = true; //to check user enter correct integer
        // print the input date
        System.out.println("Your Entered date was: " + date);

        // check month is valid or not
        if (month < 1 || month > 12) {

            System.out.println("Entered Date is invalid:");
            System.out.println("The input month  is not from 1 - 12.");
            calendar = false;

        }
        //check day is valid or not
        else if (day < 1) {

            System.out.println("Entered Date is invalid:");
            System.out.println("The value of day is less than 1.");
            calendar = false;
        }
        // check days in those month which has 30 days
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {

            System.out.println("Entered Date is invalid::");
            System.out.println("This month have only 30 days, but Entered day is greater than 30.");
            calendar = false;

        }
        // if month is February then check leap year and days
        else if (month == 2 && ((year % 4 == 0) && (year % 100 != 0))) {
            if (day > 29) {

                System.out.println("Entered Date is invalid::");
                System.out.println("In a leap year, only 29 days in February.");
                calendar = false;

            }
        }
        // if month is February and year is non-leap
        else if (month == 2 && day > 28) {

            System.out.println("Entered Date is invalid:");
            System.out.println("In a non-leap year, only 28 days in February.");
            calendar = false;
        }
        // if all are valid
        if (calendar)
            System.out.println("Entered Date is valid:");
    }


}
