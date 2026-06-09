import java.util.Scanner;

public class CalcularFactorial {
    
    /**
     * Método para calcular el factorial de un número
     */
    public static long calcularFactorial(int numero) {
        if (numero < 0) {
            System.out.println("Error: No se puede calcular factorial de número negativo");
            return -1;
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número N para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        long resultado = calcularFactorial(numero);
        
        if (resultado != -1) {
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
        
        scanner.close();
    }
}
