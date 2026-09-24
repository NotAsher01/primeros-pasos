import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 1;
        int positivos = 0;
        while (numero != 0) {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();
            if (numero >= 0) {
                positivos = positivos +1;
            }
        }
        System.out.println("Hay " + positivos + " positivos");
    }
}
