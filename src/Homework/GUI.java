package Homework;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel contentPane;

    /**
     * Lanch the application
     * @param args
     */
    public static void main(String[] args) {//main method is defined here.
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                GUI frame = new GUI();
                frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /*public AnswerMyQuestion() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel displayOutput = new JLabel("Display out");
        displayOutput.setBounds(22,25,124,16);
        contentPane.add(displayOutput);

        JTextArea textArea = new JTextArea();

        textArea.setBounds(22,65,402,185);
        contentPane.add(textArea);
    }*/
}
