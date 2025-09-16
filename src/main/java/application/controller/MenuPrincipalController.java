package application.controller;

import view.MenuPrincipalView;

import java.sql.SQLException;

public class MenuPrincipalController {

    private final MenuPrincipalView view;
    private final MenuCadastroController menuCadastroController;
    private final MenuExcluirController menuExcluirController;

    public MenuPrincipalController(MenuPrincipalView view, MenuCadastroController menuCadastroController, MenuExcluirController menuExcluirController) {
        this.view = view;
        this.menuCadastroController = menuCadastroController;
        this.menuExcluirController = menuExcluirController;
    }

    public void exibirMenu() throws SQLException {
        int opcao;

        do {
            opcao = view.lerOpcaoMenuPrincipal();

            switch (opcao) {
                case 1 -> menuCadastroController.exibirMenu();
                case 5 -> menuExcluirController.exibirMenu();
                case 0 -> System.out.println("Saindo do Sistema...");
                default -> System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }
}
