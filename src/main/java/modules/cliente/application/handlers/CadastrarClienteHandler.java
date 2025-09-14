package modules.cliente.application.handlers;

import modules.cliente.application.command.CadastrarClientCommand;
import modules.cliente.domain.model.Cliente;
import modules.cliente.infra.repository.dao.ClienteDAO;
import modules.cliente.infra.repository.dao.ClienteDAOImpl;

public class CadastrarClienteHandler {

    public void Handle(CadastrarClientCommand cmd) {

        var item = new Cliente(cmd.nome(),cmd.cpf_cpnj(),cmd.endereco(),cmd.cidade(),cmd.estado());

        ClienteDAO dao = new ClienteDAOImpl();

        dao.cadastrarCliente(item);

    }
}
