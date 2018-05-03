package Staff;

public class Employee {

    private String name;
    private String ni;
    private int salary;

    public Employee(String name, String ni, int salary ){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public int getSalary() {
        return salary;
    }
}
