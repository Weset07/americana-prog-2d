import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Monto inicial: ");
            double inicial = sc.nextDouble();

            System.out.print("Límite a superar: ");
            double limite = sc.nextDouble();

            double saldo = inicial;
            int meses = 0;

            System.out.println("\nMes\tSaldo");
            // Si el saldo inicial ya supera el límite, no se aplica interés
            while (saldo <= limite) {
                meses++;
                saldo = saldo * 1.05; // sumar 5% de interés compuesto
                System.out.printf("%d\t%.2f\n", meses, saldo);
            }

            double interesTotal = saldo - inicial;

            System.out.println("\n--- Resumen ---");
            System.out.println("Meses pasados: " + meses);
            System.out.printf("Interés total generado: %.2f\n", interesTotal);
            System.out.printf("Saldo final: %.2f\n", saldo);
        }
    }
}
