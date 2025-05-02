import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el primer número
        System.out.print("Ingrese el primer número: ");
        double numberOne = scanner.nextDouble();

        // Leer el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numberTwo = scanner.nextDouble();

        // Calcular la suma
        double addition = numberOne + numberTwo;

        // Mostrar el resultado
        System.out.println("La suma es: " + addition);

        scanner.close();
    }
}
