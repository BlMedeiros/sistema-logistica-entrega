package application.controller;

import view.MenuPrincipalView;

public class MenuPrincipalController {

    private final MenuPrincipalView view;
    private final MenuCadastroController menuCadastroController;

    public MenuPrincipalController(MenuPrincipalView view, MenuCadastroController menuCadastroController) {
        this.view = view;
        this.menuCadastroController = menuCadastroController;
    }

    public void exibirMenu() {
        int opcao;

        do {
            opcao = view.lerOpcaoMenuPrincipal();

            switch (opcao) {
                case 1 -> menuCadastroController.exibirMenu();
                case 0 -> System.out.println("Saindo do Sistema...");
                default -> System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }
}
