import Aeronaves.*;
import interfaces.Identificable;

public class Empleados implements Identificable {
    private String nombre;
    private Aeronave aeronaveAsignada;
    private final int rango;


    public Empleados(String nombre, int rango){
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getNombre(){
        return nombre;
    }

    public void asignarAeronaveMilitar(Aeronave aeronave){
        int rangoMinimo = 0;
        if(aeronave instanceof AeronaveMilitarAlaFija || aeronave instanceof AeronaveMilitarAlaRotativa)
        {

            if (aeronave instanceof AeronaveMilitarAlaFija) {
                rangoMinimo = ((AeronaveMilitarAlaFija) aeronave).rangoMinimoDeTrabajo(); //Acá convertimos el tipo de variable para rescatar el rango mínimo determinado en las subclases.
            } else {
                rangoMinimo = ((AeronaveMilitarAlaRotativa) aeronave).rangoMinimoDeTrabajo();
            }
            if(rango >= rangoMinimo){
                this.aeronaveAsignada = aeronave;
                System.out.println("Aeronave militar " + aeronave.getModelo() + " asignada a " + this.nombre);
            }
            else{
                System.out.println("Error: El rango de " + this.nombre + " es menor al necesario: " + rangoMinimo);
            }
            }
        else{
            System.out.println("Error. Estás tratando de asignar una aeronave civil con el método de asignación de aeronaves militares");
        }

    }

    public void asignarAeronaveCivil(Aeronave aeronave){
        if(aeronave instanceof AeronaveCivilAlaRotativa || aeronave instanceof AeronaveCivilAlaFija){
            this.aeronaveAsignada = aeronave;
            System.out.println("Aeronave civil " + aeronave.getModelo() + " asignada a " + this.nombre);
        }
        else {
            System.out.println("Error. Estás tratando de asignar una aeronave militar con el método de asignación de aeronaves civiles");
        }
    }

    public void reasignarAeronaveMilitar(Aeronave aeronave){
        asignarAeronaveMilitar(aeronave);
    }

    public void reasignarAeronaveCivil(Aeronave aeronave){
        asignarAeronaveCivil(aeronave);
    }
    public Aeronave getAeronaveAsignada(){
        return this.aeronaveAsignada;
    }

    @Override
    public String conseguirIdentificacion(){
        return nombre + "-" + "tiene un rango de nivel: " + rango;
    }
}
