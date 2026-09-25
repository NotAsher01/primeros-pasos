package ampliacion;

import java.util.Scanner;

public class ampli7 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if (numero % 2 == 0){
            System.out.println("Es multiplo");
        } else if (numero % 3 == 0) {
            System.out.println("Es multiplo");
        }
        else {
            System.out.println("No es multiplo");
        }
    }
}
