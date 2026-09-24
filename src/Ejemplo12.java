import java.util.Scanner;
public class Ejemplo12 {
    public static void main(String[] args) {
        int num1, num2;
        int eleccion;
        Scanner input = new Scanner(System.in);
        System.out.println("Elige un primer numero: ");
        num1 =  input.nextInt();
        System.out.println("Elige el segundo numero: ");
        num2 = input.nextInt();
        System.out.println("Elige si lo quieres ascendente (1) o descendiente (2): ");
        eleccion = input.nextInt();
        if (eleccion == 1){
            if (num1 > num2){
                System.out.println(num2 + " < " + num1);
            }
            else {
                System.out.println(num1 + " < " + num2);
            }
        }
        if (eleccion == 2){
            if (num1 < num2){
                System.out.println(num2 + " > " + num1);
            }
            else {
                System.out.println(num1 + " > " + num2);
            }
        }
    }
}
