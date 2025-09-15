import application.controller.MainController;
import view.MenuPrincipalView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MainController menuIniciar = new MainController(sc);

        menuIniciar.iniciar();
    }
}
