package modules.cliente.infra.persistence.dao;

import modules.cliente.domain.model.Cliente;
import modules.cliente.infra.conexao.ConnectionDB;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class ClienteDAOImpl implements ClienteDAO{

    @Override
    public void cadastrarCliente(Cliente cliente) {
        String query = """
        INSERT INTO cliente (nome, cpf_cnpj, endereco, cidade, estado)
        VALUES (?, ?, ?, ?, ?)
        """;

        try (Connection conn = ConnectionDB.connect();
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf_cnpj().getValor()); // VO
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getEstado());

            int affected = stmt.executeUpdate();
            if (affected == 0) {
                throw new RuntimeException("Falha ao cadastrar cliente, nenhuma linha afetada.");
            }

            // pega o id gerado
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    cliente.setId(idGerado);
                    System.out.println("Cliente salvo com ID: " + idGerado);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao salvar cliente no banco", e);
        }
    }




}
