import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int media = 0;
        int suma = 0;
        int hay10 = 0;
        while (numero != -1) {
            System.out.println("Ingrese un numero: ");
            numero = input.nextInt();
            if (numero >= 0) {
                suma = suma + numero;
                contador = contador + 1;
                media = (suma / contador);
            }
            if (numero == 10) {
                hay10 = hay10 +1;
            }
        }
        if (hay10 == 1){
            System.out.println("Hay 10");
        }
        else{
            System.out.println("No hay 10");
        }
        System.out.println(media);
    }
}