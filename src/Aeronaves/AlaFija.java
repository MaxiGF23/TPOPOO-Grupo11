package Aeronaves;

public abstract class AlaFija extends Aeronave{

    public AlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);
    }

    @Override
    public void realizarPrueba(){
        this.pruebaRealizada = true;
        System.out.println("Realizando prueba de vuelo de aeronave ala fija: " + this.getModelo());
    }
}
