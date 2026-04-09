import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear array de 5 notas
        double[] notas = new double[5];
        
        // Leer 5 notas
        System.out.println("Ingresa 5 notas (entre 0 y 10):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        
        // Mostrar todas las notas
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]);
        }
        
        // Calcular media
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma = suma + notas[i];
        }
        double media = suma / 5;
        
        // Encontrar la nota más alta
        double notaAlta = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] > notaAlta) {
                notaAlta = notas[i];
            }
        }
        
        // Encontrar la nota más baja
        double notaBaja = notas[0];
        for (int i = 1; i < 5; i++) {
            if (notas[i] < notaBaja) {
                notaBaja = notas[i];
            }
        }
        
        // Mostrar resultados
        System.out.println("\nNota media: " + media);
        System.out.println("Nota más alta: " + notaAlta);
        System.out.println("Nota más baja: " + notaBaja);
    }
}
