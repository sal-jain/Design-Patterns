package decoraterpattern.condiments;

import decoraterpattern.Beverage;
import decoraterpattern.CondimentsDecorator;

public class Milk extends CondimentsDecorator {
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+15.00;
    }
}
