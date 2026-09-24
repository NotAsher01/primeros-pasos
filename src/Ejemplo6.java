import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        double precio;
        double preciorebajado;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el precio: ");
        precio = input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Ahora el precio rebajado");
        preciorebajado = input2.nextDouble();
        double descuento = (precio - preciorebajado)/precio * 100;
        System.out.println("El descuento es de: " + descuento + "%");
    }
}
