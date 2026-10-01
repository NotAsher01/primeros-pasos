import java.util.Scanner;

public class ejemplo31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, dividir = 1;
        System.out.println("Dime un numero: ");
        num = input.nextInt();
        for (int i= 1; i <= num; i++){
            if (num %i==0)
                System.out.println(i + "");
        }
    }
}
