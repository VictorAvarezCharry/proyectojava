import java.util.Scanner;

public class EdadaraVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("La persona es mayor de edad, puede votar.");
        } else {
            System.out.println("La persona no es mayor de edad, no puede votar.");
        }

        scanner.close();
    }
}
