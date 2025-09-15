package modules.cliente.application.handlers;

import infra.eventstore.EventStore;
import modules.cliente.application.command.CadastrarClienteCommand;
import modules.cliente.domain.event.ClienteCadastradoEvent;
import modules.cliente.domain.model.Cliente;
import modules.cliente.infra.persistence.dao.ClienteDAO;
import modules.cliente.infra.persistence.dao.ClienteDAOImpl;

public class CadastrarClienteHandler {

    public void Handle(CadastrarClienteCommand cmd) {

        var cliente = new Cliente(cmd.nome(),cmd.cpf_cpnj(),cmd.endereco(),cmd.cidade(),cmd.estado());

        ClienteDAO dao = new ClienteDAOImpl();

        dao.cadastrarCliente(cliente);

        ClienteCadastradoEvent event = new ClienteCadastradoEvent(cliente.getId(), cliente.getNome(), cliente.getCpf_cnpj(),
                cliente.getEndereco(), cliente.getCidade(), cliente.getEstado());

        EventStore.append(event);
    }
}
