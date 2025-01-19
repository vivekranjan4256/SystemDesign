package decoratordesignpattern.AdditionalDrinks;

import decoratordesignpattern.Pizza.BasePizza;

public class ColdDrink extends Drinks{

    BasePizza basePizza;

    public ColdDrink(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
