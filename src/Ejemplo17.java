import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        int horas, minutos, segundos;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la hora: ");
        horas = input.nextInt();
        System.out.println("Dime los minutos: ");
        minutos = input.nextInt();
        System.out.println("Dime los segundos: ");
        segundos = input.nextInt();
        segundos = segundos +1;
        if (segundos >= 60){
            segundos = 0;
            minutos = minutos +1;
            if (minutos >= 60){
                minutos = 0;
                horas = horas +1;
            }

        }
        System.out.println(horas + "," + minutos + "," + segundos);
    }
}
