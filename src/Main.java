//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        String n = sc.nextLine();
        // Utilizamos try para intentar ejecutar una secuencia de codigo
        // Esto sirve para capturar los errores posibles durante ejecucion de codigo
        try {
            int numero = Integer.parseInt(n);
            System.out.println("Numero introducido: " + numero);
        // catch - captura los errores y los sale por la pantalla
        } catch (NumberFormatException e) {
            System.out.println("Numero introducido no valido");
        }
    }
}