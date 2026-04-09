import java.util.Scanner;

public class UnionVectores {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Longitud del primer vector: ");
            int n1 = sc.nextInt();
            int[] v1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                System.out.print("Elemento " + (i + 1) + " del primer vector: ");
                v1[i] = sc.nextInt();
            }
            System.out.print("Longitud del segundo vector: ");
            int n2 = sc.nextInt();
            int[] v2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                System.out.print("Elemento " + (i + 1) + " del segundo vector: ");
                v2[i] = sc.nextInt();
            }
            // Union sin repetidos
            int[] union = new int[n1 + n2];
            int unionSize = 0;
            for (int num : v1) {
                boolean existe = false;
                for (int j = 0; j < unionSize; j++) {
                    if (union[j] == num) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    union[unionSize++] = num;
                }
            }
            for (int num : v2) {
                boolean existe = false;
                for (int j = 0; j < unionSize; j++) {
                    if (union[j] == num) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    union[unionSize++] = num;
                }
            }
            // Elementos repetidos
            int[] repetidos = new int[Math.min(n1, n2)];
            int repetidosSize = 0;
            for (int num1 : v1) {
                for (int num2 : v2) {
                    if (num1 == num2) {
                        boolean yaAgregado = false;
                        for (int k = 0; k < repetidosSize; k++) {
                            if (repetidos[k] == num1) {
                                yaAgregado = true;
                                break;
                            }
                        }
                        if (!yaAgregado) {
                            repetidos[repetidosSize++] = num1;
                        }
                        break;
                    }
                }
            }
            System.out.print("Union sin elementos repetidos: ");
            for (int i = 0; i < unionSize; i++) {
                System.out.print(union[i] + " ");
            }
            System.out.println();
            System.out.print("Elementos repetidos: ");
            for (int i = 0; i < repetidosSize; i++) {
                System.out.print(repetidos[i] + " ");
            }
            System.out.println();
        }
    }
}