import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de personas (n): ");
        int n = sc.nextInt();
        String[] nombres = new String[n];
        char[] sexos = new char[n];
        int[] edades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Sexo (M/F): ");
            sexos[i] = sc.next().charAt(0);
            System.out.print("Edad: ");
            edades[i] = sc.nextInt();
        }
        // a) Promedio de edades
        int sumaEdades = 0;
        for (int edad : edades) sumaEdades += edad;
        double promedio = (double) sumaEdades / n;
        System.out.println("Promedio de edades: " + promedio);
        // b) Cantidad de mujeres con edad inferior al promedio
        int countMujeres = 0;
        for (int i = 0; i < n; i++) {
            if (sexos[i] == 'F' && edades[i] < promedio) countMujeres++;
        }
        System.out.println("Cantidad de mujeres con edad inferior al promedio: " + countMujeres);
        // c) Nombre del hombre más viejo
        int maxEdadHombre = -1;
        String nombreHombreViejo = "";
        for (int i = 0; i < n; i++) {
            if (sexos[i] == 'M' && edades[i] > maxEdadHombre) {
                maxEdadHombre = edades[i];
                nombreHombreViejo = nombres[i];
            }
        }
        if (!nombreHombreViejo.equals("")) {
            System.out.println("Nombre del hombre más viejo: " + nombreHombreViejo);
        } else {
            System.out.println("No hay hombres.");
        }
        // d) Nombres de personas con la menor edad
        int minEdad = edades[0];
        for (int i = 1; i < n; i++) {
            if (edades[i] < minEdad) minEdad = edades[i];
        }
        System.out.print("Nombres de personas con la menor edad (" + minEdad + "): ");
        for (int i = 0; i < n; i++) {
            if (edades[i] == minEdad) {
                System.out.print(nombres[i] + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}