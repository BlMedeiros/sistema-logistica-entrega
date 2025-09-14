package view;

import core.utils.ConsoleUtils;

import java.util.Scanner;

public class MenuCadastroView {
    private final Scanner sc;

    public MenuCadastroView(Scanner sc) {
        this.sc = sc;
    }

    public int lerOpcaoMenuCadastro() {

        System.out.println("\n\n---MENU DE CADASTRO---");
        System.out.println("\n1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Motorista");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }
}
