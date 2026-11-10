
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        double[] notas = new double[3];
        double suma = 0;

        for (int i = 0; i < 3; i++) {
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (0-20): ");
                notas[i] = sc.nextDouble();

                if (notas[i] < 0 || notas[i] > 20) {
                    System.out.println("Nota inválida. Intente nuevamente.");
                }
            } while (notas[i] < 0 || notas[i] > 20);

            suma += notas[i];
        }

        double promedio = suma / 3;
        String estado = promedio >= 11 ? "APROBADO" : "DESAPROBADO";

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Estudiante: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);

        sc.close();
    }
}
