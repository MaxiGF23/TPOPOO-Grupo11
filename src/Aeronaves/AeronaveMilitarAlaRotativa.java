package Aeronaves;

public class AeronaveMilitarAlaRotativa extends AlaRotativa {
    private boolean tieneArmamento;

    public AeronaveMilitarAlaRotativa(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, int cantAspas, int cantRotores, boolean tieneArmamento) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima, cantAspas, cantRotores);
        this.tieneArmamento = tieneArmamento;
    }

}

