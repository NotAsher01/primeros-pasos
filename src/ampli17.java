import java.util.Scanner;

public class ampli17 {
    public static void main(String[] args) {
        int numero, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        numero2 = input.nextInt();
        if (numero == numero2){
            System.out.println("Son dos números iguales");
        } else if (numero > numero2) {
            System.out.println("El primer numero es mayor");
        }
        else {
            System.out.printf("El segundo numero es mayor");
        }
    }
}
