public class Cálculodelahipotenusa {
    public static void main(String[] args) {
        double catetoOne = 3.0; // Primer cateto
        double catetoTwo = 4.0; // Segundo cateto

        // Cálculo de la hipotenusa utilizando el teorema de Pitágoras
        double hypotenusa = Math.sqrt(Math.pow(catetoOne, 2) + Math.pow(catetoTwo, 2));

        System.out.println("La hipotenusa es: " + hypotenusa);
    }
    // Método para calcular la hipotenusa dado dos catetos  
}
