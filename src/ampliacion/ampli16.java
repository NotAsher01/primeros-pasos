package ampliacion;

import java.util.Scanner;

public class ampli16 {
    public static void main(String[] args) {
        int num1, num2, num3, mayor;
        Scanner input = new Scanner(System.in);
        System.out.print("Dime un numero: ");
        num1= input.nextInt();
        System.out.print("Dime un segundo numero: ");
        num2= input.nextInt();
        System.out.print("Dime un tercer numero: ");
        num3= input.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
            System.out.print(mayor);
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
            System.out.println(mayor);
        } else {
            mayor = num3;
            System.out.println(mayor);
        }
    }
}
