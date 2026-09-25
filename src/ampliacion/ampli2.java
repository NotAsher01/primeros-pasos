package ampliacion;

import java.util.Scanner;

public class ampli2 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if (numero % 2 == 0){
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}
