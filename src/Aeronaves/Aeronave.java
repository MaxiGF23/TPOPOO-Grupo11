package Aeronaves;
import interfaces.Identificable;

public abstract class Aeronave implements Identificable {
    protected String modelo;
    protected String numDeSerie;
    protected int pesoMaximo;
    protected int capacidad;
    protected double velocidadMaxima;
    protected boolean pruebaExitosa;


    public Aeronave(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("El modelo no puede estar vacío");
        }
        if (numDeSerie == null || numDeSerie.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de serie no puede estar vacío");
        }
        if (pesoMaximo <= 0) {
            throw new IllegalArgumentException("El peso máximo debe ser mayor que 0");
        }
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        if (velocidadMaxima <= 0) {
            throw new IllegalArgumentException("La velocidad máxima debe ser mayor que 0");
        }

        this.modelo = modelo;
        this.numDeSerie = numDeSerie;
        this.pesoMaximo = pesoMaximo;
        this.capacidad = capacidad;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirInfo() {
        try {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Numero de Serie: " + this.numDeSerie);
            System.out.println("Peso máximo: " + this.pesoMaximo);
            System.out.println("Capacidad: " + this.capacidad);
            System.out.println("Velocidad Máxima: " + this.velocidadMaxima + " knots");
        } catch (Exception e) {
            System.err.println("Error al mostrar la información: " + e.getMessage());
        }
    }

    public String getNumeroDeSerie()
    {
        return this.numDeSerie;
    }

    public String getModelo(){
        return this.modelo;
    }

    @Override
    public String conseguirIdentificacion() {
        return this.getModelo() + "-" + this.numDeSerie;
    }

    //Metodo común para todas las aeronaves para realizar pruebas
    public abstract void realizarPrueba();

    public boolean isListaParaEntregar(){
        return pruebaExitosa;
    }

}
