import Aeronaves.*;
import interfaces.Identificable;

import java.util.HashSet;
import java.util.Set;

public class Empleado implements Identificable {
    private final String nombre;
    private final int rango;
    private final Set<Aeronave> aeronavesAsignadas;

    public Empleado(String nombre, int rango) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del empleado no puede estar vacío");
        }
        if (rango < 1 || rango > 10) {
            throw new IllegalArgumentException("El rango debe estar entre 1 y 10");
        }

        this.nombre = nombre;
        this.rango = rango;
        this.aeronavesAsignadas = new HashSet<>();

        System.out.println("Se agrego a " + nombre + " como nuevo empleado" + "\n");
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarAeronaveMilitar(Aeronave aeronave) {
        if (!(aeronave instanceof AeronaveMilitarAlaFija || aeronave instanceof AeronaveMilitarAlaRotativa)) {
            throw new IllegalArgumentException("Solo se pueden asignar aeronaves militares.");
        }

        if (aeronavesAsignadas.contains(aeronave)) {
            System.out.println("La aeronave ya está asignada a este empleado.");
            return;
        }

        if (this.rango < 5) {
            throw new IllegalStateException("El rango del empleado no es suficiente para manejar aeronaves militares.");
        }

        aeronavesAsignadas.add(aeronave);
        System.out.println("Aeronave militar " + aeronave.getModelo() + " asignada a " + this.nombre);
    }

    public void cantidadDeAeronavesAsignadas() {
        try {
            System.out.println("Cantidad de Aeronaves asignadas al empleado " +
                    this.getNombre() + ": " + aeronavesAsignadas.size());
        } catch (Exception e) {
            System.err.println("Error al mostrar la cantidad de aeronaves: " + e.getMessage());
        }
    }

    public void asignarAeronaveCivil(Aeronave aeronave) {
        try {
            if (aeronave == null) {
                throw new IllegalArgumentException("La aeronave no puede ser nula");
            }

            if (!(aeronave instanceof AeronaveCivilAlaRotativa ||
                    aeronave instanceof AeronaveCivilAlaFija)) {
                throw new IllegalArgumentException("Error: Estás tratando de asignar una aeronave militar con el método de asignación de aeronaves civiles");
            }

            aeronavesAsignadas.add(aeronave);
            System.out.println("Aeronave civil " + aeronave.getModelo() +
                    " asignada a " + this.nombre);
        } catch (Exception e) {
            System.err.println("Error en la asignación de aeronave civil: " + e.getMessage());
        }
    }

    @Override
    public String conseguirIdentificacion() {
        return nombre + "-" + "tiene un rango de nivel: " + rango;
    }

    public void imprimirAeronavesAsignadas() {
        System.out.println("Aeronaves asignadas a " + nombre + ":");
        if (aeronavesAsignadas.isEmpty()) {
            System.out.println("No hay aeronaves asignadas");
        } else {
            for (Aeronave aeronave : aeronavesAsignadas) {
                System.out.println(aeronave.conseguirIdentificacion());
            }
        }
    }

    public void realizarPruebaAeronave(Aeronave aeronave, Cliente cliente) {
        if (aeronavesAsignadas.contains(aeronave)) {
            System.out.println("El empleado " + nombre + " comienza a ejecutar las pruebas.");

            // Usamos un bucle while para realizar las pruebas hasta que sean exitosas
            while (!aeronave.isListaParaEntregar()) {
                aeronave.realizarPrueba(); // Ejecuta la prueba
                if (!aeronave.isListaParaEntregar()) {
                    System.out.println("La prueba de la aeronave " + aeronave.getModelo() + " falló. Se envia a revision nuevamente...");
                } else break; // Sale del bucle si la prueba es exitosa
            }

            System.out.println("La aeronave " + aeronave.getModelo() + " pasó la prueba y esta lista para entregar. Procediendo con la entrega.");
            cliente.entregaAeronave(aeronave);

        } else {
            System.out.println("La aeronave " + aeronave.getModelo() + " no está asignada a " + nombre);
        }
    }
}
