import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num1 = input.nextInt();
        System.out.println("Dime un segundo numero: ");
        num2 = input.nextInt();
        if (num1 > num2){
            System.out.println("Este es el numero mayor: " + num1);
        }
        else {
            System.out.println("Este es el numero mayor: " + num2);
        }
    }
}
