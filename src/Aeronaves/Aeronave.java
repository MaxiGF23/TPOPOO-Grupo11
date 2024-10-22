package Aeronaves;

public abstract class Aeronave {
    private String modelo;
    private String numDeSerie;
    private int pesoMaximo;
    private int capacidad;
    private double velocidadMaxima;

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


}
