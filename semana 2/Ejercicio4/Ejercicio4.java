import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear vector de 10 elementos
        int[] vector = new int[10];
        int cantidad = 0;
        
        // Llenar el vector hasta que se llene o se introduzca un número negativo
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número (negativo para terminar): ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            vector[i] = numero;
            cantidad = cantidad + 1;
        }
        
        // Mostrar solo los elementos introducidos
        System.out.println("\nElementos introducidos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(vector[i]);
        }
    }
}
