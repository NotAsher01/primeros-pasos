import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        int saldo_inicial, elegir, movimientos;
        Scanner input = new Scanner(System.in);
        System.out.println("Cuanto saldo inicial tienes?");
        saldo_inicial = input.nextInt();
        System.out.println("1. Ingresar 2. Retirar 0. Salir");
        elegir = input.nextInt();
        while (elegir != 0) {
            if (elegir == 1) {
                System.out.println("Cuanto quieres ingresar?");
                movimientos = input.nextInt();
                saldo_inicial = saldo_inicial + movimientos;
                System.out.println(saldo_inicial+"€");
                System.out.println("1. Ingresar 2. Retirar 0. Salir");
                elegir = input.nextInt();
            } else if (elegir == 2) {
                    System.out.println("Cuanto quieres retirar");
                    movimientos = input.nextInt();
                    saldo_inicial = saldo_inicial - movimientos;
                    System.out.println(saldo_inicial +"€");
                    System.out.println("1. Ingresar 2. Retirar 0. Salir");
                    elegir = input.nextInt();
                }
            }
        System.out.println("Adios");
        }
    }