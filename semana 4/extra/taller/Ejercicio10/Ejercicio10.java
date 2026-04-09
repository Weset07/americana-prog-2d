import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del primer vector: ");
        int n1 = sc.nextInt();
        int[] v1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Elemento " + (i + 1) + " del primer vector: ");
            v1[i] = sc.nextInt();
        }
        System.out.print("Tamaño del segundo vector: ");
        int n2 = sc.nextInt();
        int[] v2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Elemento " + (i + 1) + " del segundo vector: ");
            v2[i] = sc.nextInt();
        }
        boolean iguales = n1 == n2;
        if (iguales) {
            for (int i = 0; i < n1; i++) {
                if (v1[i] != v2[i]) {
                    iguales = false;
                    break;
                }
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
        sc.close();
    }
}