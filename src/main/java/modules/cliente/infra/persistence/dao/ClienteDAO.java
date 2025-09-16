package modules.cliente.infra.persistence.dao;

import modules.cliente.domain.model.Cliente;

import java.sql.SQLException;

public interface ClienteDAO {

    void cadastrarCliente(Cliente cliente);

    void excluirCliente(int id) throws SQLException;

    Cliente buscarPorId(int id);
}
