package staff.management;

import staff.Employee;

public class Manager extends Employee {

    public String deptName;
    private Double budget;

    public Manager(String name, String ni, Double salary, String deptName){
        super(name, ni, salary);
        this.deptName = deptName;
        this.budget = budget;
    }

    public String getDeptName() {
        return deptName;
    }



}
