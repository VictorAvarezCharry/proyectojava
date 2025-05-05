import java.util.Scanner;

public class temperaturaalta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados: ");
        int grados = scanner.nextInt();

        if (grados >= 30) {
            System.out.println("La temperatura es alta");
        } else {
            System.out.println("La temperatura es baja");
        }

        scanner.close();
    }
}
