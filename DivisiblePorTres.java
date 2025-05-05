package Divisiblepor3;
import java.util.Scanner;

/**
 * Programa que verifica si un número es divisible por 3.
 */
public class DivisiblePorTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            if (numero % 3 == 0) {
                System.out.println("El número es divisible entre 3.");
            } else {
                System.out.println("El número no es divisible entre 3.");
            }
        } catch (Exception e) {
            System.out.println("Error: Por favor ingrese un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}