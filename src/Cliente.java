import Aeronaves.*;
import interfaces.Identificable;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements Identificable {
    private final String nombre;
    private final String tipoCliente;
    private final List<Aeronave> pedidos;

    public Cliente(String nombre, String tipoCliente) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        if (tipoCliente == null || tipoCliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de cliente no puede estar vacío");
        }

        // Validación simple del tipo de cliente
        if (!"Militar".equals(tipoCliente) && !"Civil".equals(tipoCliente)) {
            throw new IllegalArgumentException("Tipo de cliente no válido. Debe ser: Civil o Militar");
        }

        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.pedidos = new ArrayList<>();

        System.out.println("Se agrego a " + nombre + " como nuevo cliente" + "\n");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void realizarPedido(Aeronave aeronave) {
        try {
            if (aeronave == null) {
                throw new IllegalArgumentException("La aeronave no puede ser nula");
            }

            validarTipoAeronave(aeronave);

            pedidos.add(aeronave);
            System.out.println("Pedido realizado para la fabricación de una aeronave modelo: " +
                    aeronave.getModelo() + "\n");
        } catch (Exception e) {
            System.err.println("Error al realizar el pedido: " + e.getMessage());
        }
    }

    private void validarTipoAeronave(Aeronave aeronave) {
        if ("Militar".equals(tipoCliente)) {
            if (!(aeronave instanceof AeronaveMilitarAlaFija ||
                    aeronave instanceof AeronaveMilitarAlaRotativa)) {
                throw new IllegalArgumentException("Cliente militar solo puede pedir aeronaves militares");
            }
        } else if ("Civil".equals(tipoCliente)) {
            if (!(aeronave instanceof AeronaveCivilAlaFija ||
                    aeronave instanceof AeronaveCivilAlaRotativa)) {
                throw new IllegalArgumentException("Cliente civil solo puede pedir aeronaves civiles");
            }
        }
    }

    public void cancelarPedido(Aeronave aeronave) {
        try {
            if (aeronave == null) {
                throw new IllegalArgumentException("La aeronave no puede ser nula");
            }
            if (!pedidos.contains(aeronave)) {
                throw new IllegalStateException("No existe un pedido para esta aeronave");
            }

            pedidos.remove(aeronave);
            System.out.println("Pedido cancelado para la aeronave modelo: " + aeronave.getModelo());
        } catch (Exception e) {
            System.err.println("Error al cancelar el pedido: " + e.getMessage());
        }
    }

    public void entregaAeronave(Aeronave aeronave) {
        try {
            if (aeronave == null) {
                throw new IllegalArgumentException("La aeronave no puede ser nula");
            }
            if (!pedidos.contains(aeronave)) {
                throw new IllegalStateException("Esta aeronave no está en la lista de pedidos del cliente");
            }

            System.out.println("Entregando aeronave " + aeronave.getModelo() +
                    " a cliente " + this.getNombre() + "\n");
            pedidos.remove(aeronave);
        } catch (Exception e) {
            System.err.println("Error en la entrega de la aeronave: " + e.getMessage());
        }
    }

    public void imprimirPedidos() {
        try {
            if (pedidos.isEmpty()) {
                System.out.println("El cliente " + this.getNombre() + " no tiene pedidos activos" + "\n");
                return;
            }

            System.out.println("Pedidos realizados por el cliente " + this.getNombre() + ":");
            for (Aeronave aeronave : pedidos) {
                System.out.println("- Modelo: " + aeronave.getModelo() +
                        " (ID: " + aeronave.getNumeroDeSerie() + ")");
            }

            System.out.println();

        } catch (Exception e) {
            System.err.println("Error al imprimir los pedidos: " + e.getMessage());
        }
    }

    @Override
    public String conseguirIdentificacion() {
        return nombre + "-" + tipoCliente;
    }
}