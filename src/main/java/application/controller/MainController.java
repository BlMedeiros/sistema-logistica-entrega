package application.controller;

import view.MenuCadastroView;
import view.MenuPrincipalView;

import java.util.Scanner;

public class MainController {
    private final MenuPrincipalController principalController;
    private final MenuCadastroController cadastroController;

    public MainController(Scanner sc) {

        MenuPrincipalView principalView = new MenuPrincipalView(sc);
        MenuCadastroView cadastroView = new MenuCadastroView(sc);


        cadastroController = new MenuCadastroController(cadastroView);
        principalController = new MenuPrincipalController(principalView, cadastroController);
    }

    public void iniciar() {
        principalController.exibirMenu();
    }
}
