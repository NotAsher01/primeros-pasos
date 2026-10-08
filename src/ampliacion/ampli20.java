package ampliacion;

import java.util.Scanner;

public class ampli20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo, ingresos, gastos;
        System.out.println("Dime tu saldo: ");
        saldo = input.nextInt();
        System.out.println("Dime el ingreso: ");
        ingresos = input.nextInt();
        System.out.println("Dime los gastos: ");
        gastos = input.nextInt();
        int calculo= (ingresos - gastos) + saldo;
        if (calculo <= 0){
            System.out.println("No");
        }
        else{
            System.out.println("Si");
        }
    }
}
