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

@Override
public void realizarPrueba(){
        System.out.println("Realizando prueba de vuelo de aeronave ala rotativa: " + this.getModelo());
        if((this.cantAspas > 4 || this.cantAspas < 2) || (this.cantRotores != 2))
        {
            this.pruebaRealizada = false;
            System.out.println("Prueba fallida, la aeronave no tiene la cantidad necesaria de aspas");
        }
        else{
            this.pruebaRealizada = true;
            System.out.println("Prueba de helicóptero exitosa");
        }
}

}
