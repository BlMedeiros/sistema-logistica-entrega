package view;

import utils.ConsoleUtils;

import java.util.Scanner;

public class EntregaView {
    private final Scanner sc;

    public EntregaView(Scanner sc) {
        this.sc = sc;
    }

    public void iniciar(){
        int opcao;

        do {
            opcao = menuPrincipal();

            switch (opcao) {
                case 1:
                    gerenciarMenuCadastrar();
                    break;
                case 2:
                    gerenciarMenuBusca();
                    break;
                case 3:
                    gerenciarMenuEntrega();
                    break;
                case 4:
                    gerenciarMenuRelatorio();
                    break;
                case 5:
                    gerenciarMenuExcluir();
                    break;
                case 0:
                    System.out.println("Encerrando o Sistema....");
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }

    public void gerenciarMenuCadastrar() {

        int opcao;

        do {
            opcao = menuCadastrar();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    iniciar();
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public void gerenciarMenuBusca() {
        int opcao;

        do {
            opcao = menuBusca();

            switch (opcao) {
                case 1:
                    break;
                case 0:
                    iniciar();
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public void gerenciarMenuEntrega() {
        int opcao;

        do {
            opcao = menuEntrega();

            switch (opcao) {
                case 1:
                    break;
                case 0:
                    iniciar();
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public void gerenciarMenuRelatorio() {

        int opcao;

        do {
            opcao = menuRelatorio();

            switch (opcao) {
                case 1:
                    break;
                case 0:
                    iniciar();
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }

    public void gerenciarMenuExcluir() {
        int opcao;

        do {
            opcao = menuExcluir();

            switch (opcao) {
                case 1:
                    break;
                case 0:
                    iniciar();
                    break;
                default:
                    System.out.println("Opção Inválida! Tente Novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public int menuPrincipal() {

        System.out.println("\n\n---SISTEMA DE ENTREGAS---");
        System.out.println("\n1. Cadastrar");
        System.out.println("2. Buscar");
        System.out.println("3. Entrega");
        System.out.println("4. Relatórios");
        System.out.println("5. Excluir");
        System.out.println("0. Sair do Sistema");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }

    public int menuCadastrar() {

        System.out.println("\n\n---MENU DE CADASTRO---");
        System.out.println("\n1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Motorista");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }

    public int menuBusca() {

        System.out.println("\n\n---MENU DE BUSCA---");
        System.out.println("\n1. Buscar Peido por CPF/CNPJ do Cliente");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }

    public int menuEntrega() {

        System.out.println("\n\n---MENU DE ENTREGAS---");
        System.out.println("\n1. Criar Pedido");
        System.out.println("2. Gerar Entrega");
        System.out.println("3. Atualizar Status de Entrega");
        System.out.println("4. Cancelar Pedido");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }

    public int menuRelatorio() {

        System.out.println("\n\n---MENU DE RELÁTORIOS---");
        System.out.println("\n1. Total de Entregas por Motorista");
        System.out.println("2. Cliente com Maior Volume Entregue");
        System.out.println("3. Pedidos Pendentes por Estado");
        System.out.println("4. Entregas Atrasadas por Cidade");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }

    public int menuExcluir() {

        System.out.println("\n\n---MENU DE EXCLUSÃO---");
        System.out.println("\n1. Excluir Entrega");
        System.out.println("2. Excluir Cliente");
        System.out.println("3. Excluir Motorista");
        System.out.println("0. Voltar ao Menu Principal");

        return ConsoleUtils.lerOpcao("Digite uma Opção: ");
    }
}
