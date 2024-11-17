package Aeronaves;

public class AeronaveCivilAlaRotativa extends AlaRotativa {
    private boolean esVIP;

    public AeronaveCivilAlaRotativa(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, int cantAspas, int cantRotores, boolean esVip) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima, cantAspas, cantRotores);
        this.esVIP = esVip;
    }
}
