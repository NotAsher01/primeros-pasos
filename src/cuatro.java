import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double importe, descuento;
        System.out.println("Di el importe: ");
        importe = input.nextDouble();
        System.out.println("Eres socio?");
        String socio = input.next();
        if (socio.equals("si")) {
            if (importe > 50) {
                descuento = (importe * 10) / 100;
                System.out.println(descuento);
            } else if (importe > 100) {
                descuento = (importe * 15) / 100;
                System.out.println(descuento);
            }
            else {
                System.out.println(importe);
            }
        }
        if (socio.equals("no")) {
            if (importe > 50) {
                descuento = (importe * 5) / 100;
                System.out.println(descuento);
            } else {
                System.out.println(importe);
            }

        }
    }
}
