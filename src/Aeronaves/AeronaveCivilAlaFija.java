package Aeronaves;

public class AeronaveCivilAlaFija extends AlaFija {

    public AeronaveCivilAlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima)
    {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);
    }

    @Override
    public void realizarPrueba(){
        this.pruebaRealizada = true;
        System.out.println("Realizando prueba de vuelo para helicóptero civil modelo: " + this.getModelo());
    }

}
