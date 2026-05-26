import java.util.Scanner;

public class MatrizFormaM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño N de la matriz (NxN): ");
        int n = scanner.nextInt();
        
        int[][] matriz = new int[n][n];
        
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz en forma de M:");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
             
                if (j == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
              
                else if (j == i && i < (n + 1) / 2) {
                    System.out.print(matriz[i][j] + " ");
                }
              
                else if (j == n - 1 - i && i < (n + 1) / 2) {
                    System.out.print(matriz[i][j] + " ");
                }
                
                else if (j == n - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
           
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
