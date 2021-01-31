package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Açucar extends IngredienteDecorator {
    Caipira drink;

    public Açucar(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Açucar";
    }

    @Override
    public double cost() {
        return 0.2 + drink.cost();
    }
}
