import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Conversión de temperaturas en °C (-100 a 100, fuera del rango termina):");

            int bajoCero = 0;
            int sobreTreinta = 0;
            double suma = 0.0;
            int cuentas = 0;
            Double maximo = null;
            Double minimo = null;

            while (true) {
                System.out.print("Temperatura (°C): ");
                double c = sc.nextDouble();
                if (c < -100 || c > 100) {
                    break;
                }
                double f = c * 9 / 5 + 32;
                System.out.printf("%.2f °C = %.2f °F\n", c, f);

                cuentas++;
                suma += c;
                if (c < 0) bajoCero++;
                if (c > 30) sobreTreinta++;
                if (maximo == null || c > maximo) maximo = c;
                if (minimo == null || c < minimo) minimo = c;
            }

            System.out.println("\n--- Resultados ---");
            System.out.println("Temperaturas bajo 0 °C: " + bajoCero);
            System.out.println("Temperaturas sobre 30 °C: " + sobreTreinta);
            if (cuentas > 0) {
                System.out.printf("Promedio de temperaturas: %.2f °C\n", suma / cuentas);
                System.out.println("Máxima registrada: " + maximo + " °C");
                System.out.println("Mínima registrada: " + minimo + " °C");
            } else {
                System.out.println("No se ingresaron temperaturas válidas.");
            }
        }
    }
}
