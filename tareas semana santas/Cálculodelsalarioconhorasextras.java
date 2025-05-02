public class Cálculodelsalarioconhorasextras {
    public static void main(String[] args) {
        double salarioBase = 1000.99;
        double horasExtras = 25;
        double valorHorasextras = 1.5;
        double salarioBaseconHorasExtras = salarioBase + (horasExtras + (salarioBase * valorHorasextras));
        System.out.println(0 + "El salario base es: " + salarioBase);
        System.out.println(1 + "El valor de las horas extras es: " + horasExtras);  
        System.out.println(2 + "El valor de las horas extras es: " + valorHorasextras);
        System.out.println(3 + "El salario base con horas extras es: " + salarioBaseconHorasExtras);
        System.out.println(4 + "El salario base con horas extras es: " + (salarioBase + (horasExtras * valorHorasextras))); 
    }
    
}
