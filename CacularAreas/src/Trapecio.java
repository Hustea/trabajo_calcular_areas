// Triangle.java
package figuras;

import java.util.Scanner;

public class Trapecio {
    public static void calcularAreaTrapecio() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base mayor del trapecio: ");
        double baseMayor = scanner.nextDouble();

        System.out.print("Ingrese la base menor del trapecio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Ingrese la altura del trapecio: ");
        double altura = scanner.nextDouble();


        // Validación de datos (opcional, puedes personalizarla)
        if (baseMayor <= 0 || baseMenor <= 0 || altura <= 0) {
            System.out.println("Los valores de la base mayor, base menor y altura deben ser positivos.");
            return;
        }

        // Cálculo del área
        double area = ((baseMayor + baseMenor) * altura) / 2;

        // Impresión del resultado
        System.out.println("El área del trapecio es: " + area);
    }
}
