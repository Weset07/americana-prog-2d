import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese números uno por uno (0 para terminar):");

            int positivosCount = 0;
            int negativosCount = 0;
            double positivosSum = 0.0;
            double negativosSum = 0.0;
            Double mayor = null;
            Double menor = null;

            while (true) {
                System.out.print("Número: ");
                double num = sc.nextDouble();

                if (num == 0) {
                    break;
                }

                // seccion para actualizar mayor y menor segun el numero ingresado
                if (mayor == null || num > mayor) {
                    mayor = num;
                }
                if (menor == null || num < menor) {
                    menor = num;
                }

                if (num > 0) {
                    positivosCount++;
                    positivosSum += num;
                } else if (num < 0) {
                    negativosCount++;
                    negativosSum += num;
                }
            }

            System.out.println("\n--- Resultado ---");
            System.out.println("Números positivos ingresados: " + positivosCount);
            System.out.println("Números negativos ingresados: " + negativosCount);

            if (positivosCount > 0) {
                System.out.printf("Promedio de positivos: %.2f\n", positivosSum / positivosCount);
            } else {
                System.out.println("Promedio de positivos: N/A (no hay positivos)");
            }

            if (negativosCount > 0) {
                System.out.printf("Promedio de negativos: %.2f\n", negativosSum / negativosCount);
            } else {
                System.out.println("Promedio de negativos: N/A (no hay negativos)");
            }

            if (mayor != null && menor != null) {
                System.out.println("Mayor número ingresado: " + mayor);
                System.out.println("Menor número ingresado: " + menor);
            } else {
                System.out.println("No se ingresaron números (solo 0).");
            }
        }
    }
}
