import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i) + ": ");
            vector[i] = sc.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && vector[i] % 2 != 0) {
                suma += vector[i];
            }
        }
        System.out.println("Suma de los elementos impares en posiciones pares: " + suma);
        sc.close();
    }
}