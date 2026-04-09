import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        int mayor = vector[0];
        int menor = vector[0];
        for (int num : vector) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }
        System.out.println("Mayor elemento: " + mayor);
        System.out.println("Menor elemento: " + menor);
        sc.close();
    }
}