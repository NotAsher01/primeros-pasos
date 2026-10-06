import java.util.Scanner;

public class Ejemplo34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, numero2, resultado = 0;
        System.out.println("Dime un numero: ");
        numero = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        numero2 = input.nextInt();
        for (int i = 1;i<=numero2; i++){
            resultado = resultado + numero;
        }
        System.out.println(resultado);
    }
}
