package Empregado;

public class Empresa {
    public static void main(String[] args) {
        Empregado emp1 = new Empregado(1, "bla1", "bla1@gmail.com", 1000);
        emp1.aumento_salarial(5);
        System.out.println(emp1.get_salario());

        System.out.println("- - - - - - - - - - -");

        Chefe emp2 = new Chefe(2, "bla2", "bla2@gmail.com", 2000, 5);
        emp2.aumento_salarial(5);
        System.out.println(emp2.get_salario());

        System.out.println("- - - - - - - - - - -");

        Estagiario emp3 = new Estagiario(3, "bla3", "bla3@gmail.com", 500, 500);
        emp3.aumento_salarial(5);
        System.out.println(emp3.get_salario());
    }
}
