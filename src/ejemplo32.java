import java.util.Scanner;

public class ejemplo32 {
    public static void main(String[] args) {
        int num1= 1, num2 = 1;
        int i = 3;
        while(i<=40){
            int t = num1 + num2;
            System.out.printf("," + t);
            num1 = num2;
            num2 = t;
            i++;
        }
    }
}
