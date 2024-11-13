import java.util.Scanner;

public class MostrarDatosUsuario {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Introduzca palabra 1: ");
        var dato1 = entrada.nextLine();

        System.out.print("Introduzca palabra 2: ");
        var dato2 = entrada.nextLine();

        System.out.print("Introduzca palabra 3: ");
        var dato3 = entrada.nextLine();

        System.out.println(dato1 + " " + dato2 + " " + dato3);

        entrada.close();
    }
}