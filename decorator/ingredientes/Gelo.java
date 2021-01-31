package decorator.ingredientes;

import decorator.Caipira;
import decorator.Drink;
import decorator.IngredienteDecorator;

public class Gelo extends IngredienteDecorator {
    Caipira drink;

    public Gelo(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Gelo";
    }

    @Override
    public double cost() {
        return 0.2 + drink.cost();
    }
}
