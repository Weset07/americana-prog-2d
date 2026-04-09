import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array con los nombres de los meses
        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        // Array con los días de cada mes
        int[] dias = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Pedir número de mes
        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = scanner.nextInt();
        
        // Validar que el número esté entre 1 y 12
        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes " + mes + " es " + meses[mes]);
            System.out.println("Tiene " + dias[mes] + " días");
        } else {
            System.out.println("Número de mes inválido");
        }
    }
}
