import java.util.Scanner;

public class MatrizFormaR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño N de la matriz (NxN): ");
        int n = scanner.nextInt();
        
        int[][] matriz = new int[n][n];
        
        // Llenar la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz en forma de R:");
        
        int rectHeight = n / 2;  
        int rectWidth = n / 2 + 1;  
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i < rectHeight) {
                    
                    if (i == 0 && j < rectWidth) {
                        System.out.print(matriz[i][j] + " ");
                    }
                   
                    else if (i > 0 && i < rectHeight - 1 && (j == 0 || j == rectWidth - 1)) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    
                    else if (i == rectHeight - 1 && j < rectWidth) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                
                else {
                    if (j == 0) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    else if (j == i - rectHeight + 1) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
