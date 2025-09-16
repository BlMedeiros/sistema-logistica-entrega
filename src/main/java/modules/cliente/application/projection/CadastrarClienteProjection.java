package modules.cliente.application.projection;

import modules.cliente.domain.event.ClienteCadastradoEvent;
import modules.cliente.domain.model.Cliente;
import modules.cliente.infra.persistence.dao.ClienteDAO;

public class CadastrarClienteProjection {
    private final ClienteDAO dao;

    public CadastrarClienteProjection(ClienteDAO dao) {
        this.dao = dao;
    }

    public void apply(ClienteCadastradoEvent event) {
        dao.cadastrarCliente(new Cliente(
                event.getNome(),
                event.getCpfCnpj(),
                event.getEndereco(),
                event.getCidade(),
                event.getEstado()
        ));
    }

}
