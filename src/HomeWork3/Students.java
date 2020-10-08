/**
 * <h1> Students </h1>
 * <p>
 * 중간, 기말, 퀴즈 점수들을 평균내서 학생의 등급을 정해주는 프로그램이다.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac Students.java
 * @Run : java Students
 * Programming Assignment 1.
 * @since 04-30-2020
 */


package HomeWork3;

public class Students {
    public String name; //학생 이름
    public double qPoint; //퀴즈 두개맞추면 20점 하나맞추면 10점 아무것도 못맞추면 0점.
    public double midtermScore; // 중간 성적.
    public double finalExam; //기말 성적.


    public void writeOutput() { //출력해주기 위한 메서드.
        System.out.println("Name: " + name);

        System.out.println("Score of first quiz : " + qPoint);
        System.out.println("Score of midterm : " + midtermScore);
        System.out.println("Score of finalExam :  " + finalExam);

        System.out.println();

    }

    public double getScoreOfQuiz() {
        double quizPoint = 0;
        if (qPoint == 20) {
            quizPoint = 20;
            System.out.println(quizPoint);
        }
        if (qPoint == 10) {
            quizPoint = 10;
            System.out.println(quizPoint);
        }
        if (qPoint == 00) {
            quizPoint = 0;
            System.out.println(quizPoint);
        }

        return quizPoint;
    }

    public double getAvrOfQuiz() { //퀴즈 점수 평균 내는 메서
        double avrQuiz = 0;
        if (qPoint == 20) {
            avrQuiz = 100;
        }
        if (qPoint == 10) {
            avrQuiz = 50;
        }
        if (qPoint == 00) {
            avrQuiz = 0;
        }
        return avrQuiz;
    }

    public double getMidterm(double midScore) { //중간고사 성적 범위 지정해주는 메서드.
        if (midScore <= 100 && midScore > 0) {
            midScore = midtermScore;
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
        return midScore;
    }

    public double getFinalExam(double finalScore) { //기말고사 성적 범위 지정해주는 메서드.
        if (finalScore <= 100 && finalScore > 0) {
            finalScore = finalExam;
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
        return finalScore;
    }


    public static void main(String arg[]) { //main method of the class

        Students min = new Students(); //Students 오브젝트 불러오기.
        min.name = "minyoung";//이름은 minyoung
        min.qPoint = 20; //퀴즈 2개맞음
        min.midtermScore = 69; //중간 성적 100
        min.finalExam = 90;//기말 성적 100
        double average = (min.finalExam * 0.5) + (min.midtermScore * 0.25) + (min.getAvrOfQuiz() * 0.25);


        min.writeOutput(); // 위에 입력한값 출력해주기.
        System.out.println("The average of all points : " + average);
        System.out.println();

        if (average >= 90) { // 평균 90이 넘으면.
            System.out.println(min.name + "'s grade is A ");
        } else if (average < 90 && average >= 80) { // 평균 80이상 90 미만이면.
            System.out.println(min.name + "'s grade is B ");
        } else if (average < 80 && average >= 70) { // 평균 70이상 80미만이면.
            System.out.println(min.name + "'s grade is C ");
        } else if (average < 70 && average >= 60) { // 평균 60이상 70 미만 이면.
            System.out.println(min.name + "'s grade is D ");
        } else {//평균 60 미만 이면.
            System.out.println(min.name + "'s grade is F ");
        }
    }
}
