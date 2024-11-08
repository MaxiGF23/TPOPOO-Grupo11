package Aeronaves;
import interfaces.Identificable;

public abstract class Aeronave implements Identificable {
    protected String modelo;
    protected String numDeSerie;
    protected int pesoMaximo;
    protected int capacidad;
    protected double velocidadMaxima;
    protected boolean pruebaRealizada;

    public Aeronave(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima)
    {
        this.modelo = modelo;
        this.numDeSerie = numDeSerie;
        this.pesoMaximo = pesoMaximo;
        this.capacidad = capacidad;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo()
    {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Numero de Serie: "+ this.numDeSerie);
        System.out.println("Peso máximo: "+ this.pesoMaximo);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.print("Velocidad Máxima: " + this.velocidadMaxima +" knots");
    }

    public String getNumeroDeSerie()
    {
        return this.numDeSerie;
    }

    public String getModelo(){
        return this.modelo;
    }

    @Override
    public String conseguirIdentificacion(){
        return this.getModelo() + "-" + this.numDeSerie;
    }

    public abstract void realizarPrueba();//Metodo común para todas las aeronaves para realizar pruebas

    public boolean isPruebaRealizada(){
        return pruebaRealizada;
    }

}
