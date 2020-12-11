package observer;

public class DivObserver implements Observer {
    private int resultado;
    private Subject concreteSubject;

    public DivObserver(Subject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);
    }

    @Override
    public void update(int valor, int divisor) {
        this.resultado = valor / divisor;
        System.out.println("Resultado: " + resultado);
    }
}
