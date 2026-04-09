import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Registro diario de lluvia (mm). Ingresa un valor negativo para terminar.");

            int diasLluviaMayor20 = 0;
            int diasSinLluvia = 0;
            double totalLluvia = 0.0;
            double diaMasLluvioso = 0.0;
            int contadorDias = 0;

            while (true) {
                System.out.print("Milímetros de lluvia: ");
                double mm = sc.nextDouble();
                if (mm < 0) {
                    break;
                }
                contadorDias++;
                totalLluvia += mm;
                if (mm == 0) {
                    diasSinLluvia++;
                }
                if (mm > 20) {
                    diasLluviaMayor20++;
                }
                if (mm > diaMasLluvioso) {
                    diaMasLluvioso = mm;
                }
            }

            System.out.println("\n--- Resumen del mes ---");
            System.out.println("Días registrados: " + contadorDias);
            System.out.println("Días con lluvia > 20 mm: " + diasLluviaMayor20);
            System.out.println("Días sin lluvia: " + diasSinLluvia);
            System.out.printf("Total de lluvia: %.2f mm\n", totalLluvia);
            if (contadorDias > 0) {
                System.out.printf("Promedio de lluvia: %.2f mm\n", totalLluvia / contadorDias);
                System.out.println("Día más lluvioso (mm): " + diaMasLluvioso);
            } else {
                System.out.println("No se registró ningún día.");
            }
        }
    }
}
