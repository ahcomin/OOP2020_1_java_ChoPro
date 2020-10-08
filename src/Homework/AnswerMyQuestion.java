/**
 * <h1> Answer My Question</h1>
 * This program change font of the letters showing new console screen
 * that includes answered questions by the user
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Programming Assignment 3.
 * @since 04-10-2020
 */
package Homework;// name of package

import javax.swing.*; //It is imported for using JFrame, JPanel and JLabel methods. It is container that can store a group of components
import java.awt.*; //It is imported for using Container methods.
import java.util.Scanner; //imported the scanner class from util package.


public class AnswerMyQuestion {//name of class

    public static void main(String[] args) {//main method is defined here.

        Scanner keyBoard = new Scanner(System.in);//keyboard is the instance of the scanner class.

        String color, food, animal, name; //String 타입의 color, food, animal, name 추

        /*
         color, food, animal and name that is variable is for reading a entered the words by user

         */
        System.out.println("Enter your favorite color : ");
        color = keyBoard.nextLine();
        System.out.println("Enter your favorite food : ");
        food = keyBoard.nextLine();
        System.out.println("Enter your favorite animal : ");
        animal = keyBoard.nextLine();
        System.out.println("Enter the name of your best friend : ");
        name = keyBoard.nextLine();

        JFrame frame = new JFrame(); //JFrame class is a type of container which inherits the java.

        //frame.add(pan);
        Container contentPan = frame.getContentPane(); //Objects are added to the content pane layer of the container.
        JPanel panel = new JPanel(); //JPanel is a lightweight container which is used to group a set of components together.

        //입력받은 문자열들을 크기 14, 이텔릭체로 바꾸기 위해 객체를 만든 것
        Font fontColor = new Font(color, Font.ITALIC, 14);
        Font fontFood = new Font(food, Font.ITALIC, 14);
        Font fontAnimal = new Font(animal, Font.ITALIC, 14);
        Font fontName = new Font(name, Font.ITALIC, 14);

        //JLabel is used to display a short string
        JLabel labelColor = new JLabel(color);
        JLabel labelFood = new JLabel(food);
        JLabel labelAnimal = new JLabel(animal);
        JLabel labelName = new JLabel(name);
        JLabel[] message = new JLabel[100]; //유저에게 완성된 문장으로 보여주기 위한 문자열들을 넣는곳. 그냥 인덱스를 크게 잡아 보았습니다.

        labelColor.setFont(fontColor); //color 에 입력받은 문자열을 이탤릭체로 바꾸기.
        labelFood.setFont(fontFood); //food 에 입력받은 문자열을 이탤릭체로 바꾸기.
        labelAnimal.setFont(fontAnimal); //animal 에 입력받은 문자열을 이탤릭체로 바꾸기.
        labelName.setFont(fontName); //named에 입력받은 문자열을 이탤릭체로 바꾸기.


        //panel에 labelcolor, labelFood, labelAnimal, labelName 추가
        message[0] = new JLabel("I had a dream that ");
        panel.add(message[0]);
        panel.add(labelName);
        message[1] = new JLabel(" ate a");
        panel.add(message[1]);
        panel.add(labelColor);
        panel.add(labelAnimal);
        message[2] = new JLabel("and said it tasted like ");
        panel.add(message[2]);
        panel.add(labelFood);
        message[3] = new JLabel("!");
        panel.add(message[3]);


        contentPan.add(panel); //panel에 넣은 모든것들을 컨테이너에 넣어 출력해주기 위한것 컨테이너에 모든 컴포넌트들을 부착!


        frame.setSize(400, 300); //프레임의 크기.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 종료했을때 메모리상에도 사라지게 하기.
        frame.setVisible(true); //프레임을 보여주는 메소드.

    }
}
