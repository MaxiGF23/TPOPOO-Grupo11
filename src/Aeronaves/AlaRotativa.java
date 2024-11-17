package Aeronaves;

public abstract class AlaRotativa extends Aeronave {
    private int cantAspas;
    private int cantRotores;

    public AlaRotativa(String modelo, String numDeSerie, int pesoMaximo, int capacidad,
                       double velocidadMaxima, int cantAspas, int cantRotores) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);

        if (cantAspas < 2 || cantAspas > 8) {
            throw new IllegalArgumentException("La cantidad de aspas debe estar entre 2 y 8" + "\n");
        }
        if (cantRotores <= 0) {
            throw new IllegalArgumentException("La cantidad de rotores debe ser mayor que 0" + "\n");
        }

        this.cantAspas = cantAspas;
        this.cantRotores = cantRotores;
    }

    @Override
    public void realizarPrueba() {
        try {
            System.out.println("Realizando prueba de vuelo de aeronave ala rotativa: " + modelo + " (" + numDeSerie + ")");
            if ((cantAspas > 4 || cantAspas < 2) || (cantRotores != 2)) {
                this.pruebaExitosa = false;
                System.out.println("Prueba fallida, la aeronave no cumple con las especificaciones técnicas" + "\n");
            } else {
                this.pruebaExitosa = true;
                System.out.println("Prueba de helicóptero exitosa" + "\n");
            }
        } catch (Exception e) {
            System.err.println("Error durante la prueba: " + e.getMessage());
            this.pruebaExitosa = false;
        }
    }
}