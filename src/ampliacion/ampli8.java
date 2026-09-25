package ampliacion;

import java.util.Scanner;

public class ampli8 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if (numero % 2 == 0 && numero % 3 == 0){
            System.out.println("Es multiplo de los 2");
        }
        else {
            System.out.println("No es multiplo de los 2 simultaneamente");
        }
    }
}
