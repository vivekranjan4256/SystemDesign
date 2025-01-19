package decoratordesignpattern;

import decoratordesignpattern.AdditionalDrinks.ColdDrink;
import decoratordesignpattern.AdditionalDrinks.Soda;
import decoratordesignpattern.Pizza.BasePizza;
import decoratordesignpattern.Pizza.Farmhouse;
import decoratordesignpattern.ToppingDecorator.ExtraCheese;
import decoratordesignpattern.ToppingDecorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new Farmhouse());
        System.out.println("Cost for Farmhouse with ExtraCheese is: "+ basePizza.cost());
        BasePizza basePizza1 = new Mushroom (new ExtraCheese(new Farmhouse()));
        System.out.println("Cost for Farmhouse with ExtraCheese with Mushroom is: "+basePizza1.cost());
        BasePizza basePizza2 = new ColdDrink(new Mushroom(new ExtraCheese(new Farmhouse())));
        System.out.println("Cost for Farmhouse with ExtraCheese with Mushroom with Cold Drink is: " + basePizza2.cost());
        BasePizza basePizza3 = new Soda(new ColdDrink(new Mushroom(new ExtraCheese(new Farmhouse()))));
        System.out.println("Cost for Farmhouse with ExtraCheese with Mushroom with Cold Drink with Soda is: " + basePizza3.cost());
    }
}