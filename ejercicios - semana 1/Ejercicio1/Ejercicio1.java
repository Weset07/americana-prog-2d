import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // vs code marca scanner como cierre inopotuno, agrregar el try hace que cierre luego de uso
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Meta de ahorro: ");
            int meta = sc.nextInt();

        int total = 0;
        int meses = 0;
        Integer menor = null;
        Integer mayor = null;

        while (total < meta) {
            System.out.print("Dinero ahorrado en el mes " + (meses + 1) + ": ");
            int ahorro = sc.nextInt();
            total += ahorro;
            meses++;

            if (menor == null || ahorro < menor) {
                menor = ahorro;
            }
            if (mayor == null || ahorro > mayor) {
                mayor = ahorro;
            }
        }

        double promedio = (meses > 0) ? (double) total / meses : 0;

        System.out.println("\n--- Resultado del plan de ahorro ---");
        System.out.println("Meses transcurridos: " + meses);
        System.out.printf("Promedio mensual: %.2f\n", promedio);
        System.out.println("Menor ahorro registrado: " + menor);
        System.out.println("Mayor ahorro registrado: " + mayor);
        }
    }
}
