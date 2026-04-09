import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector A: ");
        int a = sc.nextInt();
        int[] vectorA = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Elemento " + (i + 1) + " de A: ");
            vectorA[i] = sc.nextInt();
        }
        System.out.print("Tamaño del vector B: ");
        int b = sc.nextInt();
        int[] vectorB = new int[b];
        for (int i = 0; i < b; i++) {
            System.out.print("Elemento " + (i + 1) + " de B: ");
            vectorB[i] = sc.nextInt();
        }
        int[] concatenado = new int[a + b];
        for (int i = 0; i < a; i++) {
            concatenado[i] = vectorA[i];
        }
        for (int i = 0; i < b; i++) {
            concatenado[a + i] = vectorB[i];
        }
        System.out.print("Vector A: ");
        for (int num : vectorA) System.out.print(num + " ");
        System.out.println();
        System.out.print("Vector B: ");
        for (int num : vectorB) System.out.print(num + " ");
        System.out.println();
        System.out.print("Concatenado: ");
        for (int num : concatenado) System.out.print(num + " ");
        System.out.println();
        sc.close();
    }
}