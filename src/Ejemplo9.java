import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es positivo o negativo");
        numero = input.nextInt();
        if (numero >= 0){
            System.out.println("Es positivo");
        }
        else{
            System.out.println("Es negativo");
        }
    }
}
