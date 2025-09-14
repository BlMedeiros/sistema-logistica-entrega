package modules.cliente.application.handlers;

import modules.cliente.application.command.CadastrarClientCommand;
import modules.cliente.domain.model.Cliente;

public class CadastrarClienteHandler {

    private static int idCounter = 1;


    public void Handle(CadastrarClientCommand cmd) {

        var item = new Cliente(cmd.nome(),cmd.cpf_cpnj(),cmd.endereco(),cmd.cidade(),cmd.estado());

        int idGerado = clienteRepository.save(item);

    }
}
