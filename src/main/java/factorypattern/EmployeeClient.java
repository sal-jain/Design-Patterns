package factorypattern;

import java.sql.SQLOutput;

public class EmployeeClient {
    public static void main(String[] args){
        Employee employee = EmployeeFactory.getEmployee("Developer");
        System.out.println(employee);
        int salary = employee.getsalary();
        System.out.println("Salary : "+salary);

        Employee employee2 = EmployeeFactory.getEmployee("Tester");
        System.out.println(employee2);
        int salary2 = employee2.getsalary();
        System.out.println("Salary : "+salary2);
    }
}
