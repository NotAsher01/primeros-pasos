import java.util.Scanner;

public class Ejemplo15 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero1 = input.nextInt();
        System.out.println("Introduce el segundo: ");
        numero2 = input.nextInt();
        String operacion;
        System.out.println("Quieres sumarlos(+), restarlos(-), multiplicarlos(*) o dividirlos(/)");
        operacion = input.next();
        switch (operacion){
            case "+":
                System.out.println("El resultado es " + (numero1+numero2));
                break;
            case "-":
                System.out.println("El resultado es " + (numero1-numero2));
                break;
            case "*":
                System.out.println("El resultado es " + (numero1*numero2));
                break;
            case "/":
                System.out.println("El resultado es " + (numero1/numero2));
                break;
        }
    }
}
