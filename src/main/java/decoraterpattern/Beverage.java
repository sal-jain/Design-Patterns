package decoraterpattern;
//Base class
public abstract class Beverage {
    public String description  = "unknown beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
