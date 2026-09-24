import java.util.Scanner;
public class ejemplo3 {
    public static void main(String[] args) {
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        area = input.nextInt();
        int resultado;
        resultado= area * area;
        System.out.println("Result: " + resultado);

    }
}
