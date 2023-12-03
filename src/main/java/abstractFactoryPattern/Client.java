package abstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee1.name();
        System.out.println(employee1.salary());

        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee2.name();
        System.out.println(employee2.salary());
    }
}
