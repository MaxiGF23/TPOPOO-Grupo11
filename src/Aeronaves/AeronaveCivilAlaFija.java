package Aeronaves;

public class AeronaveCivilAlaFija extends AlaFija {
    private boolean esVIP;
    public AeronaveCivilAlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, int cantidadMotores, boolean esVip)
    {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima, cantidadMotores);
        this.esVIP = esVip;
    }

}
