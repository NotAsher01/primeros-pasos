package ampliacion;

import java.util.Scanner;

public class ampli9 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if (numero % 2 == 0 && numero % 3 != 0){
            System.out.printf("Es multiplo de 2 pero no de 3");
        }
        else {
            System.out.printf("No cumple la condición.");
        }
    }
}
