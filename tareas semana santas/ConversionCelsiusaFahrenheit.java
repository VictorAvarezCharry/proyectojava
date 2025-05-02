import java.util.Scanner;

public class ConversionCelsiusaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular los grados Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Mostrar el resultado
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}

