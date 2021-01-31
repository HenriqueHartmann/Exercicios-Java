package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Vodka extends IngredienteDecorator {
    Caipira drink;

    public Vodka(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Vodka";
    }

    @Override
    public double cost() {
        return 2 + drink.cost();
    }
}
