package OOP8;

import java.util.Scanner;

public class ArrayOfTemperatures {
    public static void main(String[] args) {
        /*
        int size = 8;
        double [] temperature = enw double[size];
        라고 표현 할 수 있다.
        뭐.. 뒤에 다 size 로 바꿔워야 하긴 하지만 이해하기 쉬움 ㅇㅅㅇ.

         - temperature.length
           자바는 이 메서드를 이미 갖고있엉
           매번 배열을 불러오지 않아도됨.

         */
        double[] temperature = new double[7];
        // Read temperatures and compute thier average :
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 7 temperature");

        double sum = 0;
        for (int index = 0; index < 7; index++) {
            temperature[index] = keyboard.nextDouble();

        }
        double average = sum / 7;
        System.out.println("The average temperature is " + average);
        // Display each temperature and its relation to the average :
        System.out.println("The temperature are");

        for( int index = 0; index < 7; index++){
            System.out.println(temperature[index]);
        }
        System.out.println("Have a nice week");
    }
}
