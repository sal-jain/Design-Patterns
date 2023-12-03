package decoraterpattern.beverages;

import decoraterpattern.Beverage;

public class DarkRoast extends Beverage {
    Beverage beverage;
    public DarkRoast(){
        description = "Dark Roast";
    }
    public double cost(){
        return 50.00;
    }
}
