package Aeronaves;

public class AeronaveMilitarAlaFija extends AlaFija {
    private boolean tieneArmamento;
    private int cantArmamento;

    public AeronaveMilitarAlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, boolean tieneArmamento, int cantArmamento) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);
        this.tieneArmamento = tieneArmamento;
        this.cantArmamento = cantArmamento;

    }
}
