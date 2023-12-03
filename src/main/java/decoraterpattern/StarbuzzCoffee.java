package decoraterpattern;

import decoraterpattern.beverages.DarkRoast;
import decoraterpattern.beverages.Espresso;
import decoraterpattern.beverages.Houseblend;
import decoraterpattern.condiments.Milk;
import decoraterpattern.condiments.Mocha;
import decoraterpattern.condiments.Soy;
import decoraterpattern.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args){
        //Object with no condiments
        Beverage beverage = new Espresso();
        System.out.println("Selected Coffee with condiments: "+beverage.getDescription()+"\nTotal amount: "+beverage.cost());

        //Object with condiments
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println("Selected Coffee with condiments: "+beverage1.getDescription()+"\nTotal amount: "+beverage1.cost());

        Beverage beverage2 = new Houseblend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Milk(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("Selected Coffee with condiments: "+beverage2.getDescription()+"\nTotal amount: "+beverage2.cost());
    }
}
