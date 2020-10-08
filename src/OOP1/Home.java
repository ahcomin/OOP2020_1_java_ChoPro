package OOP1;

import java.util.Scanner;

public class Home {
    public static void main(String arg[]) {
        double fahrenheit, celsius;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter C for celsius of F for fahrenheit : ");//select 'fahrenheit' or 'celsius'.
        String select = kb.nextLine();
        if (select.equals("c") || select.equals("C")) {
            System.out.println("Enter the degree of fahrenheit");
            fahrenheit = kb.nextDouble();
            double degree_C = 5 * (fahrenheit - 32) / 9; //계산 공식.
            System.out.println("Temperature is " + degree_C);
        } else if (select.equals("f") || select.equals("F")) {
            System.out.println("Enter the degree of celsius");
            celsius = kb.nextDouble();
            double degree_F = (9 * (celsius) / 5) + 32;
            System.out.println("Temperature is " + degree_F);

        } else { //그 외의 것을 입력했을경우 에러 표시를 나타나게 해줍니다.
            System.out.println("ERROR!!");
        }

        /* 이걸로도 할 수 있지않나??

        switch (degree) {

            case "C":
            case "c":
                System.out.println(Degrees_F);
                break;

            case "F":
            case "f":
                System.out.println(Degrees_C);
                break;

        }*/

    }
}
