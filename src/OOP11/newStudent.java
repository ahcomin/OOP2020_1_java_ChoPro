package OOP11;

public class newStudent {
    private int studentNumber;

    public newStudent() {
        super();
        studentNumber = 0; //Indicating no number yet
    }

    public newStudent(String initialName, int initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber) {
        setName(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }

    public void writeOutput() {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }

    public boolean equals(newPerson otherStudent) {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }

}
