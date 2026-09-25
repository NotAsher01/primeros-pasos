package ampliacion;

import java.util.Scanner;

public class ampli5 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if (numero == 0){
            System.out.println("El producto de 0 por cualquier número es 0");
        }
        else {
            System.out.println("Di otro numero: ");
            int numero2 = input.nextInt();
            int multi = numero * numero2;
            System.out.println("El resultado es: " + multi);
        }
    }
}
