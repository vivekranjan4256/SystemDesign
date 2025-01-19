package decoratordesignpattern.ToppingDecorator;

import decoratordesignpattern.Pizza.BasePizza;

public class ExtraCheese extends BasePizza {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+10;
    }

}
