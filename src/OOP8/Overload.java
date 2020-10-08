package OOP8;

public class Overload {
    public static void main(String[] args) {
        double average1 = Overload.getAverage(40.0, 40.0);
        double average2 = Overload.getAverage(1.0, 2.0, 3.0);
        double average3 = Overload.getAverage('a', 'b');

        System.out.println("average 1 = " + average1);
        System.out.println("average2= " + average2);
        System.out.println("average3 = " + average3);
    }

    public static double getAverage(double first, double second) {
        return (first + second) / 2.0;
    }

    public static double getAverage(double first, double second, double third) {
        return (first + second + third) / 3.0;
    }

    public static double getAverage(char first, char second) {
        return (char) (((int) first + (int) second / 2));
    }
}
