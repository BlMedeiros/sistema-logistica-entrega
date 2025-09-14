package modules.cliente.infra.repository.dao;

import modules.cliente.domain.model.Cliente;

public interface ClienteDAO {

    void cadastrarCliente(Cliente cliente);
    void excluirCliente(Cliente cliente);
}
