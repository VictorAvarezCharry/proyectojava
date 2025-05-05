import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("El número es positivo");
        } else if (number < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        scanner.close();
    }
}
