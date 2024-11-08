import Aeronaves.Aeronave;
import interfaces.Identificable;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Identificable {
    private String nombre;
    private String tipoCliente;
    private List<Aeronave> pedidos; //Usamos una colección del tipo Lista para guardar los pedidos del cliente.

    public Cliente(String nombre, String tipoCliente){
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipoCliente(){
        return tipoCliente;
    }

    public void realizarPedido(Aeronave aeronave) //El modelo de aeronave tiene que estar creado previamente, es decir, debe existir.
    {
        pedidos.add(aeronave);
        System.out.println("Pedido realizado para la fabricación de una aeronave modelo: " + aeronave.getModelo());
    }

    @Override
    public String conseguirIdentificacion() {
        return nombre + "-" + tipoCliente;
    }

    public void EntregaAeronave(Aeronave aeronave) {
        if (aeronave.isPruebaRealizada()) {
            System.out.println("Entregando aeronave " + aeronave.getModelo() + "a cliente " + this.getNombre());

        } else {
            System.out.println("Error. La aeronave no pasó la etapa de pruebas aún");
        }

    }
    public void imprimirPedidos(){
        System.out.println("Pedidos realizados por el cliente " + this.getNombre() + ":");
        for(Aeronave aeronave : pedidos){
            System.out.println(aeronave.getModelo());
        }
    }
}
