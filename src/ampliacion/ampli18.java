package ampliacion;

import java.util.Scanner;

public class ampli18 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        if (numero % 2 == 0){
            System.out.print((numero + 2) + "," + (numero + 4) + "," + (numero + 6) + "," + (numero + 8) + "," + (numero + 10));
        }
        else {
            System.out.print((numero + 1) + "," + (numero + 3) + "," + (numero + 7) + "," + (numero + 9) + "," + (numero + 11));
        }
    }
}
