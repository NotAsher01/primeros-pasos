import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        edad = input.nextInt();
        if (edad >= 18){
            System.out.println("Mayor de edad");
        }
    }
}
