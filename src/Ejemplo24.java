import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, factor= 1;
        System.out.printf("Dime un numero: ");
        numero = input.nextInt();
        for (int i= 1; i <= numero; i++){
            factor = factor * i;
            System.out.println(factor);
        }
    }
}
