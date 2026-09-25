package ampliacion;

import java.util.Scanner;

public class ampli11 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        numero2 = input.nextInt();
        if (numero % 2 == 0 && numero2 % 2 == 0) {
            System.out.printf("Los dos son pares");
        } else {
            System.out.printf("Los dos no son pares");
        }
    }
}
