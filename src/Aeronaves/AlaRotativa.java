package Aeronaves;

public abstract class AlaRotativa extends Aeronave {
    private int cantAspas;
    private int cantRotores;

public AlaRotativa(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, int cantAspas, int cantRotores)
{
    super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);
    this.cantAspas = cantAspas;
    this.cantRotores = cantRotores;

}

}
