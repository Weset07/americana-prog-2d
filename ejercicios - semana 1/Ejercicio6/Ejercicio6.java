import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Saldo inicial: ");
            double saldo = sc.nextDouble();

            double totalRetirado = 0.0;
            int retiros = 0;

            while (saldo > 0) {
                System.out.print("Cantidad a retirar (negativo para terminar): ");
                double pedido = sc.nextDouble();
                if (pedido < 0) {
                    break;
                }
                if (pedido > saldo) {
                    System.out.println("No puede retirar más del saldo disponible.");
                    continue;
                }
                saldo -= pedido;
                totalRetirado += pedido;
                retiros++;
            }

            System.out.println("\n--- Resumen ---");
            System.out.printf("Total retirado: %.2f\n", totalRetirado);
            System.out.println("Número de retiros: " + retiros);
            if (retiros > 0) {
                System.out.printf("Promedio de retiros: %.2f\n", totalRetirado / retiros);
            } else {
                System.out.println("Promedio de retiros: N/A");
            }
            System.out.printf("Saldo restante: %.2f\n", saldo);
        }
    }
}
