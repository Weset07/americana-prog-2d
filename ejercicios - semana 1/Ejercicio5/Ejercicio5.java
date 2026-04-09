import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Carrera de suma: dos jugadores compiten hasta 100 puntos.");

            int puntaje1 = 0;
            int puntaje2 = 0;
            int turnos = 0;

            while (puntaje1 < 100 && puntaje2 < 100) {
                turnos++;
                System.out.print("Puntaje del jugador 1 en el turno " + turnos + ": ");
                puntaje1 += sc.nextInt();
                System.out.print("Puntaje del jugador 2 en el turno " + turnos + ": ");
                puntaje2 += sc.nextInt();
            }

            System.out.println("\n--- Resultado ---");
            if (puntaje1 >= 100 && puntaje1 > puntaje2) {
                System.out.println("Ganó jugador 1");
            } else if (puntaje2 >= 100 && puntaje2 > puntaje1) {
                System.out.println("Ganó jugador 2");
            } else if (puntaje1 >= 100 && puntaje2 >= 100) {
                // ambos llegan en el mismo turno; comparar cuál es mayor
                if (puntaje1 > puntaje2) 
                    System.out.println("Ganó jugador 1 (ambos superaron 100)");
                else if (puntaje2 > puntaje1)
                    System.out.println("Ganó jugador 2 (ambos superaron 100)");
                else
                    System.out.println("Empate exacto");
            }

            System.out.println("Turnos totales: " + turnos);
            System.out.println("Puntaje final jugador 1: " + puntaje1);
            System.out.println("Puntaje final jugador 2: " + puntaje2);
            System.out.println("Diferencia de puntos: " + Math.abs(puntaje1 - puntaje2));
        }
    }
}
