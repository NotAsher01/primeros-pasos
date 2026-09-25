package ampliacion;

import java.util.Scanner;

public class ampli6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("dime un numero: ");
        int numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        int numero2 = input.nextInt();
        if (numero2 == 0){
            System.out.println("Error");
        }
        else {
            int division = numero / numero2;
            System.out.println("El resultado es: " + division);
        }
    }
}
