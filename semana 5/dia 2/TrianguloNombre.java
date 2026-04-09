import java.util.Scanner;

public class TrianguloNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un nombre: ");
        String nombre = sc.nextLine();

        for (int i = 1; i <= nombre.length(); i++) {
            System.out.println("* " + nombre.substring(0, i));
        }
    }
}
