package decoraterpattern;

public abstract class CondimentsDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
