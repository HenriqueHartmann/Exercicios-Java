package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Adoçante extends IngredienteDecorator {
    Caipira drink;

    public Adoçante(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Adoçante";
    }

    @Override
    public double cost() {
        return 0.1 + drink.cost();
    }
}
