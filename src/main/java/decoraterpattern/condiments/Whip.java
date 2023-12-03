package decoraterpattern.condiments;

import decoraterpattern.Beverage;
import decoraterpattern.CondimentsDecorator;

public class Whip extends CondimentsDecorator {
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+" Whip";
    }
    @Override
    public double cost() {
        return beverage.cost()+15.00;
    }
}
