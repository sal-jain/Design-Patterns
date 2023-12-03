package decoraterpattern.condiments;

import decoraterpattern.Beverage;
import decoraterpattern.CondimentsDecorator;

public class Soy extends CondimentsDecorator {
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+12.00;
    }
}
