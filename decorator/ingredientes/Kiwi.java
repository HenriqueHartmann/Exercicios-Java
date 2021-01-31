package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Kiwi extends IngredienteDecorator {
    Caipira drink;

    public Kiwi(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Kiwi";
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}
