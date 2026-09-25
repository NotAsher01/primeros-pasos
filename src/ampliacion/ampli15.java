package ampliacion;

import java.util.Scanner;

public class ampli15 {
    public static void main(String[] args) {
        int tiempo, horas, minutos, segundos;
        Scanner input = new Scanner(System.in);
        System.out.printf("Introduce el tiempo en segundos: ");
        tiempo = input.nextInt();
        horas = tiempo / 3600;
        tiempo = tiempo % 3600;
        minutos = tiempo / 60;
        tiempo = tiempo % 60;
        segundos = tiempo;
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
    }
}
