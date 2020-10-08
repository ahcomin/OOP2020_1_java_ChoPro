package Week3;

import java.util.Scanner;

public class StringEqualityDemo {
    public static void main(String arg[]) {
        String s1, s2;
        System.out.println("Enter two lines of text:");
        Scanner keyboard = new Scanner(System.in);
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();

        if (s1.equals(s2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal");
        }
        if (s2.equals(s1)) {
            System.out.println("The two lines are equal.");

        } else
            System.out.println("The two lines are not equal.");

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("But the lines are equal, ignoring case.");
        } else
            System.out.println("Lines are not equal, even ignoring case.");
        /* 사전적으로 먼저 위치해 있을때 s1 < s2라고 할 수 있다 ASCII 코
        예를 들어 "abc" < "xyz"드

         s1.compareTo(s2)
         나올 수 있는 값 :
                -1
                -
                1
                해석 잘하는 법
                (s1 < compare(s2)) < 0 라고 생각하기
                면, s1이 s2보다 앞선다 (먼저 온다)


                */

    }
}
