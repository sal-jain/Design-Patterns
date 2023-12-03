package decoraterpattern.condiments;

import decoraterpattern.Beverage;
import decoraterpattern.CondimentsDecorator;

public class Mocha extends CondimentsDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
    public double cost(){
        return beverage.cost()+20.00;
    }
}
