package view;

import core.utils.ConsoleUtils;

public class MenuBuscaView {
    public int menuBusca() {

        System.out.println("\n\n---MENU DE BUSCA---");
        System.out.println("\n1. Buscar Peido por CPF/CNPJ do Cliente");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }
}
