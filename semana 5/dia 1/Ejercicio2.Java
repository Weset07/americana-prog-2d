import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int vnumeros = sc.nextInt() + 1; // +1 para evitar el índice 0

        int[] vector = new int[vnumeros];
        int contador = 0;
        int pares = 0;

        // Leer el vector
        for (int i = 1; i < vnumeros; i++) {
            System.out.print("Elemento " + (i) + ": ");
            vector[i] = sc.nextInt();
        }

        // Procesar el vector
        for (int i = 1; i < vnumeros; i++) {
            int num = vector[i];

            if (num % 2 == 0) { // Verifica si es par
                int suma = 0;
                pares++; // Contar el número de pares
                int temp = Math.abs(num); // por si hay negativos

                while (temp > 0) {
                    suma += temp % 10;
                    temp /= 10;
                }

                if (suma % 2 != 0) { // suma impar
                    contador++;
                }
            }
        }

        System.out.println("Cantidad de números pares es " + pares + " con suma de dígitos impar: " + contador);
    }
}
