package factorypattern;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Developer")){
            return new Developer();
        }else if(empType.trim().equalsIgnoreCase("Tester")){
            return new Tester();
        }
        return null;
    }
}
