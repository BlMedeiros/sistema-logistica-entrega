package application.controller;

import modules.cliente.application.command.CadastrarClienteCommand;
import modules.cliente.application.handlers.CadastrarClienteHandler;
import modules.cliente.domain.model.valueobjects.Documento;
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
                case 1 -> cadastrarCliente();
                case 2 -> System.out.println();
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }

    public void cadastrarCliente() {
        String nome = view.lerNomeCliente();

        String documentoTexto = view.lerDocumentoCliente();
        Documento documento = new Documento(documentoTexto);

        String endereco = view.lerEnderecoCliente();
        String cidade = view.lerCidadeCliente();
        String estado = view.lerEstadoCliente();

        CadastrarClienteCommand cmd = new CadastrarClienteCommand(nome, documento, endereco, cidade, estado);

        var handler = new CadastrarClienteHandler();
        handler.Handle(cmd);
    }
}


