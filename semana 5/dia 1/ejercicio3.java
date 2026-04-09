import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        int sumaTotal = 0;

        // Llenar vector
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            sumaTotal += vector[i];
        }

        System.out.println("\nResultados:");

        for (int i = 0; i < n; i++) {
            int num = vector[i];
            String numero = String.valueOf(num);

            int sumaExtremos = 0;
            int sumaMedios = 0;

            if (numero.length() == 1) {
                sumaExtremos = num;
            } else {
                int primero = Character.getNumericValue(numero.charAt(0));
                int ultimo = Character.getNumericValue(numero.charAt(numero.length() - 1));
                sumaExtremos = primero + ultimo;

                for (int j = 1; j < numero.length() - 1; j++) {
                    sumaMedios += Character.getNumericValue(numero.charAt(j));
                }
            }

            System.out.println("Número: " + num);

            // 🔹 IF para extremos
            if (sumaExtremos % 2 == 0) {
                System.out.println("Suma extremos: " + sumaExtremos + " → Par");
            } else {
                System.out.println("Suma extremos: " + sumaExtremos + " → Impar");
            }

            // 🔹 IF para medios
            if (sumaMedios % 2 == 0) {
                System.out.println("Suma medios: " + sumaMedios + " → Par");
            } else {
                System.out.println("Suma medios: " + sumaMedios + " → Impar");
            }

            System.out.println("---------------------");
        }

        int promedio = sumaTotal / n;
        System.out.println("Promedio del vector: " + promedio);

        sc.close();
    }
}
