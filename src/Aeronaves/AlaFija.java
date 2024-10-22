package Aeronaves;

abstract class AlaFija extends Aeronave{

    public AlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);
    }
}
