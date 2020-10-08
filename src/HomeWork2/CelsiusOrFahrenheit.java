/**
 * <h1> Celsius Or Fahrenheit </h1>
 * A program that prints out the result value calculated in Fahrenheit
 * and the result calculated in Celsius when Fahrenheit is written.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac CelsiusOrFahrenheit.java
 * @Run : java CelsiusOrFahrenheit
 * Programming Assignment 3.
 * @since 04-21-2020
 */
package HomeWork2; //name of package.
//import scanner
import java.util.Scanner;

public class CelsiusOrFahrenheit {

    public static void main(String arg[]) {//main method is defined here.
        //the variable of double type.
        double fahrenheit, celsius;

        //create scanner
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter C for celsius of F for fahrenheit : ");//select 'fahrenheit' or 'celsius'.
        //select c of f
        String select = kb.nextLine();

        if (select.equals("c") || select.equals("C")) { //check 'select' variable equals string 'c' or 'C'.

            System.out.println("Enter the degree of fahrenheit");
            fahrenheit = kb.nextDouble(); //input degree of fahrenheit
            double degree_C = 5 * (fahrenheit - 32) / 9; //계산 공식.
            System.out.println("Temperature is " + degree_C);
        } else if (select.equals("f") || select.equals("F")) { //check 'select' variable equals string 'f' or 'F'.
            System.out.println("Enter the degree of celsius"); // Displaying the output.
            celsius = kb.nextDouble(); //input degree of celsius.
            double degree_F = (9 * (celsius) / 5) + 32;//계산 공식.
            System.out.println("Temperature is " + degree_F); // Displaying the output.

        } else { //  If you enter anything else, It will output an error.
            System.out.println("ERROR!!");
        }


    }
}
