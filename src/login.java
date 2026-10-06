import java.util.Objects;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        int max_intentos= 3;
        String login, contraseña;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime la contraseña: ");
        contraseña = input.next();
        while (max_intentos != 0){
            System.out.println("Inicia sesion con la contraseña: ");
            login = input.next();
            if (login.equals(contraseña)){
                System.out.println("Has iniciado sesión!");
                max_intentos = 0;
            }
            else{
                max_intentos = max_intentos -1;
                System.out.println("Te quedan " + max_intentos + " intentos");
            }
        }
    }
}
