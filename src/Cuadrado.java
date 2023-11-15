import java.util.Scanner;

public class Cuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("INGRESE UN NUMERO ");

        int numero = scanner.nextInt();

        int cuadrado = numero * numero;

        System.out.println("EL NUMERO ELEVADO AL CUADRADO DE " + numero + " ES " + cuadrado);

        scanner.close();

    }
}
