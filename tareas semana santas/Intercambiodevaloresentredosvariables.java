public class Intercambiodevaloresentredosvariables {
    public static void main(String[] args) {
        int a = 5; // Primer valor
        int b = 10; // Segundo valor

        System.out.println("Antes del intercambio: a = " + a + ", b = " + b);

        // Intercambio de valores
        int temp = a; // Guardamos el valor de 'a' en una variable temporal
        a = b; // Asignamos el valor de 'b' a 'a'
        b = temp; // Asignamos el valor guardado en 'temp' a 'b'

        System.out.println("Después del intercambio: a = " + a + ", b = " + b);
    }
}
