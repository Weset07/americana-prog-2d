import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        
        int vocalesAbiertas = 0;
        int vocalesCerradas = 0;
        
        for (char c : palabra.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'o') {
                vocalesAbiertas++;
            } else if (c == 'i' || c == 'u') {
                vocalesCerradas++;
            }
        }
        
        System.out.println("Vocales abiertas (a, e, o): " + vocalesAbiertas);
        System.out.println("Vocales cerradas (i, u): " + vocalesCerradas);
        
        scanner.close();
    }
}