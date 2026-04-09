import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        int ultimo = vector[n - 1];
        int countIgualesUltimo = 0;
        for (int num : vector) {
            if (num == ultimo) countIgualesUltimo++;
        }
        int primero = vector[0];
        int countDiferentesPrimero = 0;
        for (int num : vector) {
            if (num != primero) countDiferentesPrimero++;
        }
        System.out.println("Cantidad de elementos iguales al último: " + countIgualesUltimo);
        System.out.println("Cantidad de elementos diferentes al primero: " + countDiferentesPrimero);
        sc.close();
    }
}