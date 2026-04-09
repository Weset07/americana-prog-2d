import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] vector1 = new String[5];
        String[] vector2 = new String[5];
        
        
        System.out.println("Ingresa 5 palabras:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            vector1[i] = scanner.nextLine();
        }
        
        
        for (int i = 0; i < 5; i++) {
            vector2[i] = vector1[4 - i];
        }
        
       
        System.out.println("\nVector original:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vector1[i]);
        }
        
        // Mostrar vector invertido
        System.out.println("\nVector invertido:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vector2[i]);
        }
    }
}
