import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        num1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Dime el segundo: ");
        num2 = input2.nextInt();
        if (num1 > num2){
            System.out.println(num2 + " < " + num1);
        }
        else {
            System.out.println(num1 + " < " + num2);
        }
    }
}
