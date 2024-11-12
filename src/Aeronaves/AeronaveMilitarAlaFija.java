package Aeronaves;

public class AeronaveMilitarAlaFija extends AlaFija {
    private boolean tieneArmamento;
    private int cantArmamento;
    private int rangoMinimo;

    public AeronaveMilitarAlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, boolean tieneArmamento, int cantArmamento, int rangoMinimo) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);
        this.tieneArmamento = tieneArmamento;
        this.cantArmamento = cantArmamento;
        this.rangoMinimo = rangoMinimo;
    }

   /* @Override
    public void realizarPrueba(){
        this.pruebaRealizada=true;
        System.out.println("La aeronave militar está: "+ this.getModelo() +" realizando pruebas de vuelo");
    }*/

    public int rangoMinimoDeTrabajo(){
        return this.rangoMinimo;
    }
}
