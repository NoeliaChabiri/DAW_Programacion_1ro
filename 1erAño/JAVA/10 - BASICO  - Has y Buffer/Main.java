import java.util.Scanner;

public class EjemploScannerCompleto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Ejemplo de uso de Scanner en Java ===");

        // --- Leer nombre completo ---
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine(); // lee toda la línea

        // --- Leer edad (entero) ---
        System.out.print("Ingrese su edad: ");
        while (!sc.hasNextInt()) { // valida que sea entero, si no repite while
            System.out.println("Error: debe ingresar un número entero.");
            sc.next(); // descarta entrada inválida
        }
        int edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // --- Leer altura (decimal) ---
        System.out.print("Ingrese su altura en metros (ej: 1.75): ");
        while (!sc.hasNextDouble()) { // valida que sea decimal
            System.out.println("Error: debe ingresar un número decimal.");
            sc.next(); // descarta entrada inválida
        }
        double altura = sc.nextDouble();
        sc.nextLine(); // limpiar buffer para evitar que nextLine()
        // lea el Enter sobrante después de nextInt(), nextDouble(), etc.

        // --- Leer ciudad ---
        System.out.print("Ingrese su ciudad de residencia: ");
        while (!sc.hasNext()) { // valida que haya texto
            System.out.println("Error: debe ingresar texto válido.");
            sc.next();
        }
        String ciudad = sc.nextLine();

        // --- Mostrar datos ingresados ---
        System.out.println("\n=== Datos ingresados ===");
        System.out.println("Nombre completo: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Ciudad: " + ciudad);

        sc.close();
    }
}
