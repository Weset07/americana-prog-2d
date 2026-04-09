import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear tres vectores de 5 elementos
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        
        // Leer valores para vector1
        System.out.println("Ingresa 5 números para vector1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector1[" + i + "]: ");
            vector1[i] = scanner.nextInt();
        }
        
        // Leer valores para vector2
        System.out.println("Ingresa 5 números para vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.print("vector2[" + i + "]: ");
            vector2[i] = scanner.nextInt();
        }
        
        // Calcular vector3 = vector1 + vector2
        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        
        // Mostrar vector3
        System.out.println("\nResultado de vector3 = vector1 + vector2:");
        for (int i = 0; i < 5; i++) {
            System.out.println("vector3[" + i + "] = " + vector3[i]);
        }
    }
}
