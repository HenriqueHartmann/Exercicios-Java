package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Morango extends IngredienteDecorator {
    Caipira drink;

    public Morango(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Morango";
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}
