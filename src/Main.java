import Aeronaves.*;

public class Main {
    public static void main(String[] args) {

        //Creación de empleados
       Empleados jorge = new Empleados("Jorge", 1);
       Empleados david = new Empleados("David", 5);

       //Creación de Aeronaves
        AeronaveCivilAlaFija cessna = new AeronaveCivilAlaFija("Cessna P10", "LV050", 1200, 3, 300);
        AeronaveMilitarAlaRotativa uh60 = new AeronaveMilitarAlaRotativa("UH60", "AE-012", 2000, 16, 400, 4, 2, true, 4);
        AeronaveCivilAlaRotativa bell407 = new AeronaveCivilAlaRotativa("Bell 407", "LV91218", 1000, 6, 400, 5, 2, false);

        //Este helicóptero tiene más aspas que las necesarias, no debería poder pasar la prueba.
         bell407.realizarPrueba();

        //Asignamos aeronaves. Jorge no debería poder trabajar en el UH60 por su rango.
        jorge.asignarAeronaveMilitar(uh60);

        jorge.asignarAeronaveCivil(cessna);
        david.asignarAeronaveMilitar(uh60);

        //Creamos cliente.
        Cliente ejercitoargentino = new Cliente("Ejercito Argentino", "Militar");
        ejercitoargentino.realizarPedido(uh60);
        ejercitoargentino.realizarPedido(uh60);
        ejercitoargentino.realizarPedido(cessna);

        //Mostramos la cantidad de aeronaves asignadas (no se deben repetir)
        jorge.cantidadDeAeronavesAsignadas();

        //Entrega de Aeronave. No debería ser válida ya que no hizo las pruebas.
        ejercitoargentino.EntregaAeronave(uh60);

        uh60.realizarPrueba();

        //Con la prueba realizada debería poder entregarse la aeronave.
        ejercitoargentino.EntregaAeronave(uh60);

        jorge.reasignarAeronaveCivil(uh60);

        //Impresión de la colección con los pedidos
        ejercitoargentino.imprimirPedidos();





    }
}