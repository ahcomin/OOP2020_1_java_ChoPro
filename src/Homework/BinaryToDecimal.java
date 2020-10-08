/**
 * <h1> Binary To Decimal </h1>
 * This program read in a four bit binary number from the keyboard as a string and converts it into decimal.
 *
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Programming Assignment 5.
 * @since 04-10-2020
 */


package Homework; //name of package.

import java.util.Scanner;
//imported the scanner class from util package.

public class BinaryToDecimal { //class declaration

    public static void main(String[] args) { //main method is defined here.

        Scanner keyboard = new Scanner(System.in); //keyboard is the instance of the scanner class.
        //declaration of the variables.
        String binary; // String 메소드인 substring 을 쓰기 위해서 데이터 타입을 String으로 선언해 주었습니다.
        String divide1, divide2, divide3, divide4; // String 메소드인 substring 을 쓰기 위해서 데이터 타입을 String으로 선언해 주었습니다.
        int cast1, cast2, cast3, cast4; // variable of integer type
        int decimal; // variable of integer type
        System.out.println("Enter a four bit binary number");//input four bit binary number.

        binary = keyboard.next();
        //dividing each of number
        divide1 = binary.substring(0, 1); //이진법의 첫번째 숫자를 divide1에 넣어주기
        divide2 = binary.substring(1, 2); //이진법의 두번째 숫자를 divide2에 넣어주기
        divide3 = binary.substring(2, 3); //이진법의 세번째 숫자를 divide3에 넣어주기
        divide4 = binary.substring(3, 4); //이진법의 네번째 숫자를 divide4에 넣어주기

        //type casting the four strings into integer
        cast1 = Integer.parseInt(divide1); //divide1을 integer로 캐스팅하여 cast1에 넣어주기.
        cast2 = Integer.parseInt(divide2); //divide2을 integer로 캐스팅하여 cast2에 넣어주기.
        cast3 = Integer.parseInt(divide3); //divide3을 integer로 캐스팅하여 cast3에 넣어주기.
        cast4 = Integer.parseInt(divide4); //divide4을 integer로 캐스팅하여 cast4에 넣어주기.

        //changing binary to decimal
        cast1 = cast1 * 8;
        cast2 = cast2 * 4;
        cast3 = cast3 * 2;
        cast4 = cast4 * 1;
        decimal = cast1 + cast2 + cast3 + cast4; // combine each of binary numbers.

        System.out.println("The converted decimal number is " + decimal); //printing the decimal number.
    }
}
