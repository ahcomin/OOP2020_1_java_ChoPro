package OOP7;

/**
 * Class of static methods th perform dimension conversions.
 */
public class DimensionConverter {
//static variable은 변수를 선언 할때 쓰고, static methods는 메소더를 선언할 때 쓴다.
    public static final int INCHES_PER_FOOT = 12;

    public static double convertFeetToInches(double feet) {
        return feet * INCHES_PER_FOOT;
    }

    public static double convertInchesToFeet(double inches) {
        return inches / INCHES_PER_FOOT;
    }
}
