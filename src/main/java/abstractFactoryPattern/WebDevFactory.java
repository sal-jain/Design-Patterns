package abstractFactoryPattern;

public class WebDevFactory  extends  AbstractEmployeeFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
