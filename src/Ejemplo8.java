import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu edad bb: ");
        edad = input.nextInt();
        if (edad >= 18){
            System.out.println("Eres mayor");
        }
        else{
            System.out.println("No eres mayor");
        }
    }
}
