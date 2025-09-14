package view;

import core.utils.ConsoleUtils;

public class MenuRelatorioView {
    public int menuRelatorio() {

        System.out.println("\n\n---MENU DE RELÁTORIOS---");
        System.out.println("\n1. Total de Entregas por Motorista");
        System.out.println("2. Cliente com Maior Volume Entregue");
        System.out.println("3. Pedidos Pendentes por Estado");
        System.out.println("4. Entregas Atrasadas por Cidade");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }
}
