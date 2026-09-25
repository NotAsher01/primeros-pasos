package ampliacion;

import java.util.Scanner;

public class ampli3 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("dime un numero: ");
        numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        numero2 = input.nextInt();
        if (numero % numero2 == 0){
            System.out.println("Es multiplo");
        }
        else{
            System.out.println("No es multiplo");
        }
    }
}
