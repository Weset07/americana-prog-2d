import java.util.Scanner;

public class OrdenarVectorDeTrabajadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = leerEntero(scanner, "Ingrese el número de trabajadores: ");

        int[] codigo = new int[n];
        String[] nombre = new String[n];
        double[] salario = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Trabajador " + (i + 1) + ":");
            codigo[i] = leerEntero(scanner, "  Código: ");
            System.out.print("  Nombre: ");
            nombre[i] = scanner.nextLine();
            salario[i] = leerDouble(scanner, "  Salario: ");
        }

        // Ordenar usando selección
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (codigo[j] < codigo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if (indiceMinimo != i) {
                int tempCodigo = codigo[i];
                codigo[i] = codigo[indiceMinimo];
                codigo[indiceMinimo] = tempCodigo;

                String tempNombre = nombre[i];
                nombre[i] = nombre[indiceMinimo];
                nombre[indiceMinimo] = tempNombre;

                double tempSalario = salario[i];
                salario[i] = salario[indiceMinimo];
                salario[indiceMinimo] = tempSalario;
            }
        }

        System.out.println("\nTrabajadores ordenados por código:");
        System.out.printf("%-10s %-20s %-10s%n", "Código", "Nombre", "Salario");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-10.2f%n", codigo[i], nombre[i], salario[i]);
        }

        scanner.close();
    }
    //agregado por si el usuario pone algun valor donde no va y no se caiga el programa
    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                int valor = scanner.nextInt();
                scanner.nextLine();
                return valor;
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                scanner.nextLine();
            }
        }
    }

    private static double leerDouble(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextDouble()) {
                double valor = scanner.nextDouble();
                scanner.nextLine();
                return valor;
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número válido.");
                scanner.nextLine();
            }
        }
    }
}
