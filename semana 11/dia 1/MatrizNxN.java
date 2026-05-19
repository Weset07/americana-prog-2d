import java.util.Scanner;

public class MatrizNxN {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = scanner.nextInt();
        
        int[][] matriz = new int[n][n];
        
        System.out.println("\nIngrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        

        System.out.println("\nMatriz ingresada:");
        mostrarMatriz(matriz);
        
        // a) Suma de elementos de cada fila
        System.out.println("\n A) SUMA DE ELEMENTOS DE CADA FILA ");
        sumaFilas(matriz);
        
        // b) Promedio de cada columna
        System.out.println("\n B) PROMEDIO DE CADA COLUMNA ");
        promedioColumnas(matriz);
        
        // c) Números pares en la diagonal principal
        System.out.println("\n C) NÚMEROS PARES EN DIAGONAL PRINCIPAL ");
        paresdiagonalPrincipal(matriz);
        
        // d) Números impares en la diagonal secundaria
        System.out.println("\n D) NÚMEROS IMPARES EN DIAGONAL SECUNDARIA ");
        imparesdiagonalSecundaria(matriz);
        
        scanner.close();
    }
    
    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // a) Suma de elementos de cada fila
    public static void sumaFilas(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Suma de la fila " + i + ": " + suma);
        }
    }
    
    // b) Promedio de cada columna
    public static void promedioColumnas(int[][] matriz) {
        int n = matriz.length;
        for (int j = 0; j < n; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += matriz[i][j];
            }
            double promedio = suma / n;
            System.out.println("Promedio de la columna " + j + ": " + promedio);
        }
    }
    
    // c) Números pares en la diagonal principal
    public static void paresdiagonalPrincipal(int[][] matriz) {
        int conteo = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            if (matriz[i][i] % 2 == 0) {
                conteo++;
                System.out.println("Posición [" + i + "][" + i + "]: " + matriz[i][i] + " (par)");
            }
        }
        System.out.println("Total de números pares en diagonal principal: " + conteo);
    }
    
    // d) Números impares en la diagonal secundaria
    public static void imparesdiagonalSecundaria(int[][] matriz) {
        int conteo = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (matriz[i][j] % 2 != 0) {
                conteo++;
                System.out.println("Posición [" + i + "][" + j + "]: " + matriz[i][j] + " (impar)");
            }
        }
        System.out.println("Total de números impares en diagonal secundaria: " + conteo);
    }
}
