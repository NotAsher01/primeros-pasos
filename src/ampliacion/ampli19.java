package ampliacion;

import java.util.Scanner;

public class ampli19 {
    public static void main(String[] args) {
        double distancia, vel_max, tiempo;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la distancia: ");
        distancia = input.nextInt();
        System.out.println("Ahora la velocidad maxima: ");
        vel_max = input.nextInt();
        System.out.println("Y el tiempo: ");
        tiempo = input.nextInt();
        double km = distancia / 1000;
        double min = tiempo/60;
        double tiempo_2= (km / vel_max) * 60;
        double multa = ((min * 20)/100)+ min;
        if (tiempo_2 <= min){
            System.out.println("Ok");
        }
        else if (min  < 0) {
            System.out.println("Error");
        }
        else if (tiempo_2 <= multa) {
            System.out.println("Multa");
        } else if (tiempo_2 > multa) {
            System.out.println("Puntos");
        }
    }
}
