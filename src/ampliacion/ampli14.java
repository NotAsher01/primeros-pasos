package ampliacion;

import java.util.Scanner;

public class ampli14 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        numero2 = input.nextInt();
        if (numero >= 0 && numero2 >= 0){
            System.out.printf("Los dos son positivos");
        } else if (numero >= 0 && numero2 < 0) {
            System.out.printf("Uno de los numeros es positivo");
        } else if (numero < 0 && numero2 >= 0) {
            System.out.printf("Uno de los numeros es positivo");
        } else {
            System.out.printf("No hay ningun positivo");
        }
    }
}
