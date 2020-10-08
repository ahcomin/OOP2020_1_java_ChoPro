/**
 * <h1> Respond Sentence </h1>
 * <p>
 * Program to take in one line sentence as input then outputs the following If the sentence ends witha a
 * question mark and the input contains an even number of characters then output the word YES.
 * If the sentence ends with a question mark and the input contains an odd number of characters
 * out put the word NO.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac RespondSentence.java
 * @Run : java RespondSentence
 * Programming Assignment 2.
 * @since 04-21-2020
 */


package HomeWork2;// name of package is HomeWoke2.

import java.util.Scanner; //import scanner

public class RespondSentence { // name of the class is RespondSentence.

    public static void main(String[] args) {//main method is defined here.

        System.out.println("This program will take a user sentence input and give a response" + "depending on the sentence");
        System.out.println("Enter a sentence : ");

        String sentence;
        //create scanner
        Scanner keyBoard = new Scanner(System.in);
        sentence = keyBoard.nextLine();

        int senLength = sentence.length(); // senLength means length of a sentence
        String senEnd = sentence.substring(senLength - 1, senLength); // senEnd means the last of a sentence.

        if (senEnd.equals("?")) { //문장에 ? 가 있는 경우
            if (senLength % 2 == 0) {//글자가 짝수개인 경우
                System.out.println("\nYES"); //displey YES
            } else if (senLength % 2 == 1) {//글자가 홀수개인 경우
                System.out.println("\nNO");//display NO

            }
        } else if (senEnd.equals("!")) { //문장끝에 ! 가 있는 경우
            System.out.println("\nWOW");//display WOW
        } else {//문장 끝에 아무 마크하지 않는 경우
            System.out.println("You always say" + " \"" + sentence + "\"");
        }
    }
}
