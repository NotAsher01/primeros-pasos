public class Ejemplo33 {
    public static void main(String[] args) {
        double num1= 1, num2 = 1;
        double i = 3, n;
        while(i<=40){
            double t = num1 + num2;
            num1 = num2;
            num2 = t;
            i++;
            n = t / num1;
            System.out.printf("," + n);
        }
    }
}
