package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtils {

    private static final Scanner sc = new Scanner(System.in);

    public static int lerOpcao(String msg) {
        int valor;
        while (true) {
            try {
                System.out.print(msg);
                valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("⚠ Entrada inválida. Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }

    public String lerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }

    public double lerDouble(String msg) {
        double valor;
        while (true) {
            try {
                System.out.print(msg);
                valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("⚠ Valor inválido. Digite um número decimal (ex: 199.99).");
                sc.nextLine();
            }
        }
    }
}
