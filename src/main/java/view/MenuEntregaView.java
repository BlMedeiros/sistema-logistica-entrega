package view;

import core.utils.ConsoleUtils;

public class MenuEntregaView {
    public int menuEntrega() {

        System.out.println("\n\n---MENU DE ENTREGAS---");
        System.out.println("\n1. Criar Pedido");
        System.out.println("2. Gerar Entrega");
        System.out.println("3. Atualizar Status de Entrega");
        System.out.println("4. Cancelar Pedido");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }
}
