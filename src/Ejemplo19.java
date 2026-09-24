import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        double precio, descuento;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el precio de un producto: ");
        precio = input.nextDouble();
        if (precio < 6){
            descuento = 0;
        } else if (precio <= 60) {
            descuento = precio * 5/100;
        } else{
            descuento = precio * 10/100;
        }
        System.out.println(precio - descuento);
    }
}
