package decoratordesignpattern.Pizza;

public class VegDelight extends BasePizza{

    @Override
    public int cost() {
        return 120;
    }
}
