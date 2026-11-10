
import java.util.Locale;
import java.util.Scanner;

class Estudiante {
    private String codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;

    // Constructor
    public Estudiante(String codigo, String nombre,
                      double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = validarNota(nota1);
        this.nota2 = validarNota(nota2);
        this.nota3 = validarNota(nota3);
    }

    // Validar que la nota esté entre 0 y 20
    private double validarNota(double nota) {
        if (!Double.isFinite(nota) || nota < 0 || nota > 20) {
            throw new IllegalArgumentException(
                "La nota debe estar entre 0 y 20."
            );
        }
        return nota;
    }

    // Calcular promedio
    public double calcularPromedio() {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Determinar estado
    public String obtenerEstado() {
        if (calcularPromedio() >= 11) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }

    // Mostrar datos del estudiante
    public void mostrarDatos() {
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.printf(Locale.US,
                "Promedio: %.2f%n", calcularPromedio());
        System.out.println("Estado: " + obtenerEstado());
    }
}

public class Main {

    public static double leerNota(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);

            if (scanner.hasNextDouble()) {
                double nota = scanner.nextDouble();

                if (Double.isFinite(nota) && nota >= 0 && nota <= 20) {
                    return nota;
                }
            } else {
                scanner.next();
            }

            System.out.println(
                "Error: ingrese una nota válida entre 0 y 20."
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== REGISTRO DE ESTUDIANTES ===");

        System.out.print("Ingrese código: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        double nota1 = leerNota(scanner, "Ingrese nota 1: ");
        double nota2 = leerNota(scanner, "Ingrese nota 2: ");
        double nota3 = leerNota(scanner, "Ingrese nota 3: ");

        Estudiante estudiante = new Estudiante(
            codigo, nombre, nota1, nota2, nota3
        );

        estudiante.mostrarDatos();

        scanner.close();
    }
}
