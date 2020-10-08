/**
 *<h1> Output Second Word </h1>
 * code to print second word if you enter the three words
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>

 * @Compile : javac OutputSecondWord.java
 * @Run : java OutputSecondWord
 * Programming Assignment 1.
 * @since 04-21-2020
 */

package HomeWork2; //name of package

import java.util.Scanner; //import scanner

public class OutputSecondWord { //class defined here
    //main method is defined here.
    public static void main(String[] args) {
        //creating the scanner object.
        Scanner keyboard = new Scanner(System.in);

        //Talking the first input String from the user.
        System.out.println("Enter the first string : ");

        //Storing the user input
        String firstStr = keyboard.next();

        //Talking the second input String from the user.
        System.out.println(" Enter the second String : ");

        String secondStr = keyboard.next();

        //Talking the third input String from the user.
        System.out.println(" Enter the third String : ");

        String thirdStr = keyboard.next();

        System.out.println(" Second String is : ");

        //checking the String lexicographically.
        if(firstStr.compareToIgnoreCase(secondStr) > 0 && firstStr.compareToIgnoreCase(thirdStr) < 0){
            System.out.println(firstStr);
        }
        else if (firstStr.compareToIgnoreCase(thirdStr) > 0 && firstStr.compareToIgnoreCase(secondStr) > 0){
            System.out.println(firstStr);
        }
        if(secondStr.compareToIgnoreCase(firstStr) > 0 && secondStr.compareToIgnoreCase(thirdStr) < 0){
            System.out.println(secondStr);
        }
        else if (secondStr.compareToIgnoreCase(thirdStr) > 0 && secondStr.compareToIgnoreCase(firstStr) < 0){
            System.out.println(secondStr);
        }
        if(thirdStr.compareToIgnoreCase(firstStr) > 0 && thirdStr.compareToIgnoreCase(secondStr) < 0){
            System.out.println(thirdStr);
        }
        else if (thirdStr.compareToIgnoreCase(secondStr) > 0 && thirdStr.compareToIgnoreCase(firstStr) < 0){
            System.out.println(thirdStr); //displaying the output.
        }
    }

}
