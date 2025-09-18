package application.controller;

import modules.cliente.application.command.ExcluirClienteCommand;
import modules.cliente.application.handlers.ExcluirClienteHandler;
import view.MenuCadastroView;
import view.MenuExcluirView;

import java.sql.SQLException;

public class MenuExcluirController {
    private final MenuExcluirView view;

    public MenuExcluirController(MenuExcluirView view) {
        this.view = view;
    }

    public void exibirMenu() throws SQLException {
        int opcao;

        do {
            opcao = view.lerOpcaoMenuExcluir();

            switch (opcao) {
                case 1 -> System.out.println();
                case 2 -> excluirCliente();
                case 0 -> System.out.println("Voltando ao Menu Principal...");
                default -> System.out.println("Opção Inválida! Tente Novamente.");
            }
        } while (opcao != 0);
    }

    public void excluirCliente() throws SQLException {
        int clienteId = view.lerIdCliente();

        ExcluirClienteCommand cmd = new ExcluirClienteCommand(clienteId);
        var handle = new ExcluirClienteHandler();

        handle.Handle(cmd);

    }
}
