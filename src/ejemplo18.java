import java.util.Scanner;

public class ejemplo18 {
    public static void main(String[] args) {
        double precio, horas, pago, impuestos, salario_neto;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el precio por hora: ");
        precio = input.nextInt();
        System.out.println("Dime el número de horas: ");
        horas = input.nextInt();
        if ( horas <= 35){
            pago = precio * horas;
        }
        else {
            double horasextra = horas - 35;
            pago = (35 * precio) + (horasextra * precio * 1.5);
        }
        if (pago <= 500){
            impuestos = 0;
        } else if (pago <= 900) {
            impuestos = (pago * 25)/100;
        }
        else {
            impuestos = (pago * 45)/100;
        }
        salario_neto = pago - impuestos;
        System.out.println("Pago bruto " + pago);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Salario neto " + salario_neto);
    }
}
