package application.controller;

import view.MenuCadastroView;
import view.MenuExcluirView;
import view.MenuPrincipalView;

import java.sql.SQLException;
import java.util.Scanner;

public class MainController {
    private final MenuPrincipalController principalController;
    private final MenuCadastroController cadastroController;
    private final MenuExcluirController excluirController;

    public MainController(Scanner sc) {

        MenuPrincipalView principalView = new MenuPrincipalView(sc);
        MenuCadastroView cadastroView = new MenuCadastroView(sc);
        MenuExcluirView excluirView = new MenuExcluirView(sc);


        cadastroController = new MenuCadastroController(cadastroView);
        excluirController = new MenuExcluirController(excluirView);
        principalController = new MenuPrincipalController(principalView, cadastroController, excluirController);
    }

    public void iniciar() throws SQLException {
        principalController.exibirMenu();
    }
}
