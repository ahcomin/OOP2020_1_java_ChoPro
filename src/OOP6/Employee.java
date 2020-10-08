package OOP6;

public class Employee {
    private String name;
    private int salary;

    public Employee(String initName, int initSalary){
        name = initName;
        salary = initSalary;
    }
    public String getName(){
        return name;

    }
    public int getSalary(){
        return salary;
    }
    public boolean equals(Employee otherEmployee){
        return this.name.equals(otherEmployee.getName()) && (this.salary == otherEmployee.salary);

    }
}
