package ListaContas;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List<Cliente> clientes;

    public ListaClientes() {
        clientes = new ArrayList<Cliente>();
    }

    public void addClientes(Cliente cli) {
        clientes.add(cli);
    }

    public void imprimirClientes() {
        for(Cliente cli:clientes)
            System.out.println(cli);
    }
}
