import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        int menor = vector[0];
        for (int num : vector) {
            if (num < menor) menor = num;
        }
        int count = 0;
        for (int num : vector) {
            if (num == menor) count++;
        }
        System.out.println("El menor número es " + menor + " y aparece " + count + " veces.");
        sc.close();
    }
}