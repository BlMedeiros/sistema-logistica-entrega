package view;

import core.utils.ConsoleUtils;
import modules.cliente.domain.model.valueobjects.Documento;

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

    public String lerNomeCliente() {
        System.out.print("Digite o Nome do Cliente: ");
        return sc.nextLine();
    }

    public String lerDocumentoCliente() {
        System.out.print("Digite o Documento do Cliente: ");
        return sc.nextLine();
    }

    public String lerEnderecoCliente() {
        System.out.print("Digite o Endereço do Cliente: ");
        return sc.nextLine();
    }

    public String lerCidadeCliente() {
        System.out.print("Digite a Cidade do Cliente: ");
        return sc.nextLine();
    }

    public String lerEstadoCliente() {
        System.out.print("Digite o Estado do Cliente: ");
        return sc.nextLine();
    }
}
