import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;
        System.out.println("Dime la nota: ");
        nota = input.nextDouble();
        System.out.println("has hecho todas las practicas? ");
        String practicas = input.next();
        if (nota < 5) {
            System.out.println("Suspendido crack");
        } else if (nota >= 5 && practicas.equals("no")) {
            System.out.println("Suspendido por falta de practicas");
        } else if (nota >= 5 && practicas.equals("si")) {
            if (nota >= 5 && nota <= 6.9) {
                System.out.println("Aprobado");
            } else if (nota >= 7 && nota <= 8.9) {
                System.out.println("Notable");
            } else if (nota >= 9 && nota <= 10) {
                System.out.println("Sobresaliente");
            }
        }
    }
}

