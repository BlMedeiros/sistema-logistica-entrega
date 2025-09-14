package application.controller;

import view.MenuCadastroView;

public class MenuCadastroController {
    private final MenuCadastroView view;

    public MenuCadastroController(MenuCadastroView view) {
        this.view = view;
    }

    public void exibirMenu() {
        int opcao;

        do {
            opcao = view.lerOpcaoMenuCadastro();

            switch (opcao) {
                case 1 -> System.out.println();
                case 2 -> System.out.println();
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }

    public void
}


