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
  Empleado ingeniero1 = new Empleado("Juan Pérez", 1);

  // Asignar la aeronave al empleado
  System.out.println("=== Asignar aeronave al empleado ===");
  ingeniero1.asignarAeronaveCivil(cessna);
  ingeniero1.imprimirAeronavesAsignadas();
  System.out.println();

  // Empleado realiza la prueba de la aeronave
  System.out.println("=== Empleado realiza prueba de la aeronave ===");
  ingeniero1.realizarPruebaAeronave(cessna, clienteCivil);

  // Verificar pedidos restantes
  System.out.println("=== Chequeando pedidos activos del cliente ===");
  clienteCivil.imprimirPedidos();

 // Ejemplo 2

  System.out.println("\n===================EJEMPLO 2=========================\n");

  //Creamos helicóptero militar
 AeronaveMilitarAlaRotativa ah1z = new AeronaveMilitarAlaRotativa("AH1Z", "AH-099", 1000,
         2, 480, 2, 2, true, 3);

 //Creamos avión militar (armado)
AeronaveMilitarAlaFija f35 = new AeronaveMilitarAlaFija("F35", "USAF-031", 1000, 1,
        1200, true, 6, 4, 2);


 //Creamos otro cliente

  System.out.println("=== Se registra un nuevo cliente en el sistema ===");
  Cliente clienteMilitar = new Cliente("USAF", "Militar");

  // Cliente realiza un pedido
  System.out.println("=== Cliente realiza un pedido ===");
  clienteMilitar.realizarPedido(ah1z);
  System.out.println("=== Cliente realiza un pedido ===");
  clienteMilitar.realizarPedido(f35);

  // Crear un empleado
  System.out.println("=== Se genera un nuevo empleado ===");
  Empleado ingeniero2 = new Empleado("Diego López", 5);

  // Asignar la aeronave al empleado
  System.out.println("=== Asignar aeronave al empleado ===");
  ingeniero2.asignarAeronaveMilitar(ah1z);
  ingeniero2.imprimirAeronavesAsignadas();
  System.out.println();

  // Empleado realiza la prueba de la aeronave
  System.out.println("=== Empleado realiza prueba de la aeronave ===");
  ingeniero2.realizarPruebaAeronave(ah1z, clienteMilitar);

  // Verificar pedidos restantes
  System.out.println("=== Chequeando pedidos activos del cliente ===");
  clienteMilitar.imprimirPedidos();

  //Probamos asignarle a un empleado con menor nivel, no debería poder
  ingeniero1.asignarAeronaveMilitar(f35);
  System.out.println();

 }
}
