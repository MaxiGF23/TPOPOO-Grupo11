package Aeronaves;
import java.util.Random;

public abstract class AlaFija extends Aeronave{
    private final int cantMotores; // Número de motores

    public AlaFija(String modelo, String numDeSerie, int pesoMaximo, int capacidad, double velocidadMaxima, int cantidadMotores) {
        super(modelo, numDeSerie, pesoMaximo, capacidad, velocidadMaxima);

        if (cantidadMotores <= 0) {
            throw new IllegalArgumentException("La cantidad de motores debe ser mayor que 0" + "\n");
        }

        this.cantMotores = cantidadMotores;
    }

    @Override
    public void realizarPrueba(){
        Random random = new Random();

        // Simulamos la elasticidad de las alas (valor aleatorio entre 5% y 10%)
        double elasticidadAla = 5 + (5 * random.nextDouble()); // 5 a 10%

        // Simulamos la potencia de los motores (cada motor genera entre 80% y 120% de la potencia estándar)
        double potenciaMinima = 100.0; // Potencia estándar por motor
        double potenciaTotal = cantMotores * (potenciaMinima * (0.8 + (0.8 * random.nextDouble())));

        System.out.println("Prueba para la aeronave " + modelo + " (" + numDeSerie + ")");
        System.out.println("Elasticidad de las alas: " + elasticidadAla + "%");
        System.out.println("Potencia alcanzada de los motores: " + potenciaTotal + " unidades");

        // Condiciones de prueba: Elasticidad debe ser entre 5% y 10%, potencia de motores > 80% de la potencia total requerida
        if (elasticidadAla >= 5 && elasticidadAla <= 10 && potenciaTotal >= cantMotores * potenciaMinima * 0.8) {
            this.pruebaExitosa = true;
            System.out.println("Prueba realizada: Aprobada" + "\n");
        } else {
            this.pruebaExitosa = false;
            System.out.println("Prueba fallida: No cumple con los estándares" + "\n");
        }
    }
}
