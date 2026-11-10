import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Estudiante: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);

        if (promedio >= 11) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: DESAPROBADO");
        }

        sc.close();
    }
}