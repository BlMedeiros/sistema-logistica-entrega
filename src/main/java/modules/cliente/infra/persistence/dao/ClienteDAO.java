package modules.cliente.infra.persistence.dao;

import modules.cliente.domain.model.Cliente;

public interface ClienteDAO {

    void cadastrarCliente(Cliente cliente);
}
