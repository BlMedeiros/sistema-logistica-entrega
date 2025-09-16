package view;

import core.utils.ConsoleUtils;

import java.util.Scanner;

public class MenuExcluirView {
    private final Scanner sc;

    public MenuExcluirView(Scanner sc) {
        this.sc = sc;
    }

    public int lerOpcaoMenuExcluir() {


        System.out.println("\n\n---MENU DE EXCLUSÃO---");
        System.out.println("\n1. Excluir Entrega");
        System.out.println("2. Excluir Cliente");
        System.out.println("3. Excluir Motorista");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }

    public int lerIdCliente() {
        System.out.print("Digite o Endereço do Cliente: ");
        return sc.nextInt();
    }
}
