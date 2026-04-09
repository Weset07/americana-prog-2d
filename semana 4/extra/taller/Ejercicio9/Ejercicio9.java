import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        int posicion = -1;
        for (int i = 0; i < n; i++) {
            if (vector[i] == 5) {
                posicion = i + 1;
                break;
            }
        }
        if (posicion != -1) {
            System.out.println("El primer 5 se encuentra en la posición " + posicion);
        } else {
            System.out.println("No se encontró un 5 en el vector.");
        }
        sc.close();
    }
}