import Aeronaves.*;

public class Main {
 public static void main(String[] args) {
  // Crear una aeronave (civil o militar)
  AeronaveCivilAlaFija cessna = new AeronaveCivilAlaFija(
          "Cessna 172", "C172-001", 1200, 4, 140, 1);

  // Crear un cliente
  System.out.println("=== Se registra un nuevo cliente en el sistema ===");
  Cliente clienteCivil = new Cliente("Aeroclub Central", "Civil");

  // Cliente realiza un pedido
  System.out.println("=== Cliente realiza un pedido ===");
  clienteCivil.realizarPedido(cessna);

  System.out.println("=== Chequeando pedidos activos del cliente ===");
  clienteCivil.imprimirPedidos();

  // Crear un empleado
  System.out.println("=== Se genera un nuevo empleado ===");
  Empleados ingenieroAeronaveCivil = new Empleados("Juan Pérez", 5);

  // Asignar la aeronave al empleado
  System.out.println("=== Asignar aeronave al empleado ===");
  ingenieroAeronaveCivil.asignarAeronaveCivil(cessna);
  ingenieroAeronaveCivil.imprimirAeronavesAsignadas();
  System.out.println();

  // Empleado realiza la prueba de la aeronave
  System.out.println("=== Empleado realiza prueba de la aeronave ===");
  ingenieroAeronaveCivil.realizarPruebaAeronave(cessna, clienteCivil);

  // Verificar pedidos restantes
  System.out.println("=== Chequeando pedidos activos del cliente ===");
  clienteCivil.imprimirPedidos();
 }
}
