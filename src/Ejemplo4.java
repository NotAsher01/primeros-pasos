import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args) {
        int primer_numero;
        int segundo_numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        primer_numero = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ahora el segundo: ");
        segundo_numero = input2.nextInt();
        int sum = primer_numero + segundo_numero;
        int sub = primer_numero - segundo_numero;
        int mult = primer_numero * segundo_numero;
        int div = primer_numero / segundo_numero;
        System.out.println("La suma es: " + sum + "\n" + "La resta es: " + sub + "\n" + "La multiplicacion es: " + mult + "\n" + "La division es: " + div);
    }
}
