package view;

import core.utils.ConsoleUtils;

import java.util.Scanner;

public class MenuPrincipalView {
    private final Scanner sc;

    public MenuPrincipalView(Scanner sc) {
        this.sc = sc;
    }

    public int lerOpcaoMenuPrincipal() {

        System.out.println("\n\n---SISTEMA DE ENTREGAS---");
        System.out.println("\n1. Cadastrar");
        System.out.println("2. Buscar");
        System.out.println("3. Entrega");
        System.out.println("4. Relatórios");
        System.out.println("5. Excluir");
        System.out.println("0. Sair do Sistema");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }



}
