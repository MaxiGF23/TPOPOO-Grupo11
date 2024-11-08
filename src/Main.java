import Aeronaves.*;

public class Main {
    public static void main(String[] args) {

        //Creación de empleados
       Empleados Jorge = new Empleados("Jorge", 1);
       Empleados David = new Empleados("David", 5);

       //Creación de Aeronaves
        AeronaveCivilAlaFija Cessna = new AeronaveCivilAlaFija("Cessna P10", "LV050", 1200, 3, 300);
        AeronaveMilitarAlaRotativa UH60 = new AeronaveMilitarAlaRotativa("UH60", "AE-012", 2000, 16, 400, 4, 2, true, 4);

        //Asignamos aeronaves. Jorge no debería poder trabajar en el UH60 por su rango.
        Jorge.asignarAeronaveMilitar(UH60);

        Jorge.asignarAeronaveCivil(Cessna);
        David.asignarAeronaveMilitar(UH60);

        //Creamos cliente.
        Cliente EjercitoArgentino = new Cliente("Ejercito Argentino", "Militar");
        EjercitoArgentino.realizarPedido(UH60);
        EjercitoArgentino.realizarPedido(UH60);
        EjercitoArgentino.realizarPedido(Cessna);

        //Entrega de Aeronave. No debería ser válida ya que no hizo las pruebas.
        EjercitoArgentino.EntregaAeronave(UH60);

        UH60.realizarPrueba();

        //Con la prueba realizada debería poder entregarse la aeronave.
        EjercitoArgentino.EntregaAeronave(UH60);

        Jorge.reasignarAeronaveCivil(UH60);

        //Impresión de la colección con los pedidos
        EjercitoArgentino.imprimirPedidos();





    }
}