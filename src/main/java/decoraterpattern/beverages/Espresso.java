package decoraterpattern.beverages;

import decoraterpattern.Beverage;

public class Espresso extends Beverage{
    Beverage beverage;
    public Espresso(){
        description = "Espresso";
    }
    public double cost(){
        return 40.00;
    }
}
