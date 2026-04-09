public class Ejercicio2 {
    public static void main(String[] args) {
        
        int[] numeros = new int[100];
        
        
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
        
        
        int suma = 0;
        for (int i = 0; i < 100; i++) {
            suma = suma + numeros[i];
        }
        
        
        double media = suma / 100.0;
        
        
        System.out.println("Suma de todos los números: " + suma);
        System.out.println("Media: " + media);
    }
}
