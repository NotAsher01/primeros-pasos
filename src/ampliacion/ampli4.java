package ampliacion;

import java.util.Scanner;

public class ampli4 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if ( numero % 10 == 0){
            System.out.println("Es multiplo, ahora dime otro numero: ");
            numero2 = input.nextInt();
            if (numero2 % 10 == 0){
                System.out.println("Tambien es multiplo");
            }
            else {
                System.out.println("No es multiplo");
            }
        }
        else {
            System.out.println("No es multiplo");
        }
    }
}
