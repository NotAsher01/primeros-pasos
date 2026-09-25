package ampliacion;

import java.util.Scanner;

public class ampli1 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        int doble = numero * 2;
        int triple = numero *3;
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);
    }
}
