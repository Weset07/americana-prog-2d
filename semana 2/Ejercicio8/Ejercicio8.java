import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear arrays para temperaturas mínima y máxima de 5 días
        int[] tempMinima = new int[5];
        int[] tempMaxima = new int[5];
        
        // Leer temperaturas de 5 días
        System.out.println("Ingresa la temperatura mínima y máxima de 5 días:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: ");
            tempMinima[i] = scanner.nextInt();
            System.out.print("Día " + (i + 1) + " - Temperatura máxima: ");
            tempMaxima[i] = scanner.nextInt();
        }
        
        // Calcular temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (tempMinima[i] + tempMaxima[i]) / 2.0;
            System.out.println("Día " + (i + 1) + ": " + media);
        }
        
        // Encontrar día con menos temperatura (temperatura mínima)
        int diaConMenorTemp = 0;
        for (int i = 1; i < 5; i++) {
            if (tempMinima[i] < tempMinima[diaConMenorTemp]) {
                diaConMenorTemp = i;
            }
        }
        System.out.println("\nDía con menor temperatura: Día " + (diaConMenorTemp + 1) + 
                           " con " + tempMinima[diaConMenorTemp] + " grados");
        
        // Buscar días con temperatura máxima igual a la ingresada
        System.out.print("\nIngresa una temperatura para buscar: ");
        int tempBuscar = scanner.nextInt();
        
        System.out.println("Días con temperatura máxima de " + tempBuscar + " grados:");
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (tempMaxima[i] == tempBuscar) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay días con esa temperatura máxima");
        }
    }
}
