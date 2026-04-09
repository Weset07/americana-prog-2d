import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Encuesta de edad (0 para terminar):");

            int menores18 = 0;
            int entre18y65 = 0;
            int mayores65 = 0;
            int totalPersonas = 0;
            int sumaEdades = 0;

            while (true) {
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                if (edad == 0) {
                    break;
                }
                totalPersonas++;
                sumaEdades += edad;

                if (edad < 18) {
                    menores18++;
                } else if (edad <= 65) {
                    entre18y65++;
                } else {
                    mayores65++;
                }
            }

            System.out.println("\n--- Resultados de la encuesta ---");
            System.out.println("Menores de 18: " + menores18);
            System.out.println("Entre 18 y 65: " + entre18y65);
            System.out.println("Mayores de 65: " + mayores65);
            if (totalPersonas > 0) {
                System.out.printf("Promedio de edad: %.2f\n", (double) sumaEdades / totalPersonas);
            } else {
                System.out.println("No se ingresaron edades.");
            }
        }
    }
}
