package OOP9;

public class Student_inheritance extends Person_inheritance {
    private int studentNumber;

    public Student_inheritance() {
        super();
        studentNumber = 0;
    }

    public Student_inheritance(String initialName, int initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber) {
        setNames(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    public static void main(String[] arg) {
    Student_inheritance s = new Student_inheritance();
    s,setNames("Warren peace");
    s.setStudentNumber(1234);
    s.writeOutput();
    }

}
