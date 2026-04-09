import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Juego de Potencias: adivina el número secreto");
            System.out.print("¿Deseas introducir el número secreto manualmente? (s/n): ");
            String opt = sc.next();
            int secreto;
            if (opt.equalsIgnoreCase("s")) {
                System.out.print("Introduce el número secreto (entero): ");
                secreto = sc.nextInt();
            } else {
                Random r = new Random();
                secreto = 1 + r.nextInt(20); // 1..20
            }

            int intentos = 0;
            int sumaIntentos = 0;
            Integer mejorDiferencia = null; // diferencia absoluta más baja entre cuadrados

            while (true) {
                System.out.print("Ingresa un número: ");
                int intento = sc.nextInt();
                intentos++;
                sumaIntentos += intento;

                long diff = (long) intento * intento - (long) secreto * secreto;
                long absDiff = Math.abs(diff);

                if (mejorDiferencia == null || absDiff < mejorDiferencia) {
                    mejorDiferencia = (int) absDiff;
                }

                if (absDiff == 0) {
                    System.out.println("acertaste el número secreto.");
                    break;
                } else if (absDiff <= 150) {
                    System.out.println("Cerca");
                } else {
                    System.out.println("Muy lejos");
                }
            }

            double promedio = (double) sumaIntentos / intentos;

            System.out.println("\n--- Resultado ---");
            System.out.println("Número de intentos: " + intentos);
            System.out.println("Diferencia absoluta más baja entre cuadrados: " + mejorDiferencia);
            System.out.printf("Promedio de los números ingresados: %.2f\n", promedio);
        }
    }
}
