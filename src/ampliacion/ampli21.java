package ampliacion;

import java.util.Scanner;

public class ampli21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        System.out.println("Dime el grosor del papel: ");
        double grosor_papel = input.nextInt();
        System.out.println("Ahora dime la altura del edificio: ");
        double altura_ed = input.nextInt();
        double metro = grosor_papel/ 1000000;
        while (metro <= altura_ed){
            metro = metro * 2;
            contador = contador + 1;
        }
        System.out.println(contador);
    }
}
