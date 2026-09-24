import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int positivos = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();
            if (numero >= 0) {
                positivos = positivos +1;
            }
        }
        System.out.println("Hay " + positivos + " positivos");
    }
}
