package decoraterpattern.beverages;

import decoraterpattern.Beverage;

public class Houseblend extends Beverage {
    Beverage beverage;
    public Houseblend(){
        description = "Houseblend";
    }
    public double cost(){
        return 30.00;
    }
}
