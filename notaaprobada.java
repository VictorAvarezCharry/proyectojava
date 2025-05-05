import java.util.Scanner;

public class notaaprobada{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nota: ");
        int nota = scanner.nextInt();

        if (nota >= 10) {
            System.out.println("su nota es aprobada");
        
            
        }else{
            System.out.println("su nota es reprobada");
        }
        scanner.close();
    }


}