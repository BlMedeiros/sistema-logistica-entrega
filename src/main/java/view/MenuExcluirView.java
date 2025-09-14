package view;

import core.utils.ConsoleUtils;

public class MenuExcluirView {
    public int menuExcluir() {

        System.out.println("\n\n---MENU DE EXCLUSÃO---");
        System.out.println("\n1. Excluir Entrega");
        System.out.println("2. Excluir Cliente");
        System.out.println("3. Excluir Motorista");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }
}
