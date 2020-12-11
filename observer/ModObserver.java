package observer;

public class ModObserver implements Observer {
    private int modulo;
    private Subject concreteSubject;

    public ModObserver(Subject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.registerObserver(this);
    }

    @Override
    public void update(int valor, int divisor) {
        this.modulo = valor % divisor;
        System.out.println("Modulo: " + modulo);
    }
}
