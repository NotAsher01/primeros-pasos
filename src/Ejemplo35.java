import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, numero2, resultado = 0;
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        numero2 = input.nextInt();
        while (numero >= numero2) {
            numero = numero - numero2;
            System.out.println(numero);
        }
    }
}
