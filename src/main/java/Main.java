import application.controller.MainController;
import view.MenuPrincipalView;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        MainController menuIniciar = new MainController(sc);

        menuIniciar.iniciar();
    }
}
