import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Stock inicial de unidades: ");
            int stock = sc.nextInt();

            if (stock <= 0) {
                System.out.println("Stock inicial debe ser mayor que 0.");
                return;
            }

            int dias = 0;
            int totalVendidas = 0;
            Integer maxVenta = null;
            Integer minVenta = null;

            while (stock > 0) {
                System.out.print("Unidades vendidas hoy: ");
                int vendidas = sc.nextInt();

                if (vendidas < 0) {
                    System.out.println("Venta no puede ser negativa. Intenta de nuevo.");
                    continue;
                }

                if (vendidas > stock) {
                    System.out.println("No puede vender más unidades de las que quedan (" + stock + "). Intenta de nuevo.");
                    continue;
                }

                // registrar día
                dias++;
                totalVendidas += vendidas;
                stock -= vendidas;

                if (maxVenta == null || vendidas > maxVenta) {
                    maxVenta = vendidas;
                }
                if (minVenta == null || vendidas < minVenta) {
                    minVenta = vendidas;
                }

                System.out.println("Stock restante: " + stock);
            }

            System.out.println("\n--- Resultado ---");
            System.out.println("Días duró el stock: " + dias);
            if (dias > 0) {
                double promedio = (double) totalVendidas / dias;
                System.out.printf("Promedio de unidades vendidas por día: %.2f\n", promedio);
                System.out.println("Máxima venta diaria: " + maxVenta);
                System.out.println("Mínima venta diaria: " + minVenta);
            } else {
                System.out.println("No se realizaron ventas.");
            }
        }
    }
}
