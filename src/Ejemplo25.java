import java.util.Scanner;

public class Ejemplo25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        for (int i = 1; i <= 10; i++){
            int multi = numero * i;
            System.out.println(numero + "*" + i + "=" + multi);
        }
    }
}
