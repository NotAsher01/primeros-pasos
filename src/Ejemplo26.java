import java.util.Scanner;

public class Ejemplo26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int numero = input.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
