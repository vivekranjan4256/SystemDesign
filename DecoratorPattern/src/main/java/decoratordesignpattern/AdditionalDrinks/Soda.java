package decoratordesignpattern.AdditionalDrinks;

import decoratordesignpattern.Pizza.BasePizza;

public class Soda extends Drinks{

    BasePizza basePizza;

    public Soda(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
