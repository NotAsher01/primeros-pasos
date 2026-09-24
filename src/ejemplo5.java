import java.util.Scanner;

public class ejemplo5 {
    public static void main(String[] args) {
        double radio;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        radio = input.nextDouble();
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El radio es: " + area);

    }
}
