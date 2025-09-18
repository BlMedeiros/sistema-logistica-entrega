package modules.cliente.application.handlers;

import infra.eventstore.EventStore;
import modules.cliente.application.command.ExcluirClienteCommand;
import modules.cliente.domain.event.ClienteExcluidoEvent;
import modules.cliente.domain.model.Cliente;
import modules.cliente.infra.persistence.dao.ClienteDAO;
import modules.cliente.infra.persistence.dao.ClienteDAOImpl;

import java.sql.SQLException;

public class ExcluirClienteHandler {

    public void Handle(ExcluirClienteCommand cmd) throws SQLException {

        ClienteDAO dao = new ClienteDAOImpl();

        Cliente cliente = dao.buscarPorId(cmd.clienteId());

        System.out.println("DEBUG id cliente = " + cliente.getId());


        ClienteExcluidoEvent event = new ClienteExcluidoEvent(cliente.getId(),cliente.getNome(),cliente.getCpf_cnpj());

        EventStore.append(event);

        dao.excluirCliente(cliente.getId());
    }
}
