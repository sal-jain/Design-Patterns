package decoraterpattern.beverages;

import decoraterpattern.Beverage;

public class Decafe extends Beverage {
    Beverage beverage;
    public Decafe(){
        description = "Decafe";
    }
    public double cost(){
        return 60.00;
    }
}
