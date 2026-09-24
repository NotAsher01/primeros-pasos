import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado1, lado2, lado3, triangulo;
        System.out.println("Dime un lado: ");
        lado1 = input.nextDouble();
        System.out.println("Dime un lado: ");
        lado2 = input.nextDouble();
        System.out.println("Dime un lado: ");
        lado3 = input.nextDouble();
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            System.out.println("Es un le triangle");
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Es equilatero");
            } else if (lado1 == lado2 && lado2 != lado3) {
                System.out.println("Es isosceles");
            } else if (lado1 != lado2 && lado2 != lado3) {
                System.out.println("Es escaleno");
            }
        }
        else {
            System.out.println("No es bb");
        }
    }
}
