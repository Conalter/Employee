package staff.techStaff;

import staff.Employee;
import staff.management.Manager;

public class Developer extends Employee {
        private String deptName;

    public Developer(String name, String ni, Double salary, String deptName) {
        super(name, ni, salary);
        this.deptName = deptName;

    }
    public String getDeptName() {
        return deptName;
    }
}
