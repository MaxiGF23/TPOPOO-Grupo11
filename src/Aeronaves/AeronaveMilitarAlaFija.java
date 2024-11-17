package Aeronaves;

public class AeronaveMilitarAlaFija extends AlaFija {
    private boolean tieneArmamento;
    private int cantArmamento;
    private int rangoMinimo;

    public AeronaveMilitarAlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, boolean tieneArmamento, int cantArmamento, int rangoMinimo, int cantidadMotores) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima, cantidadMotores);
        this.tieneArmamento = tieneArmamento;
        this.cantArmamento = cantArmamento;
        this.rangoMinimo = rangoMinimo;
    }

    public int rangoMinimoDeTrabajo(){
        return this.rangoMinimo;
    }
}
