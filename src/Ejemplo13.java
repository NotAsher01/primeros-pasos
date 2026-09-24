import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero para calificarlo: ");
        nota = input.nextInt();
        if (nota < 3){
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Suficiente");
        } else if (nota < 7) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Error");
        }
    }
}
