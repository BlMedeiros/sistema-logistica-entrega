package modules.cliente.infra.persistence.dao;

import modules.cliente.domain.model.Cliente;
import modules.cliente.domain.model.valueobjects.Documento;
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

    @Override
    public void excluirCliente(int id) throws SQLException {
        String query = "DELETE FROM cliente WHERE id = ?";

        try (Connection conn = ConnectionDB.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1,id);

            int affected = stmt.executeUpdate();
            if (affected == 0) {
                throw new RuntimeException("Falha ao excluir cliente, nenhuma linha afetada.");
            }
        }
    }

        @Override
        public Cliente buscarPorId(int id) {
            String sql = "SELECT id, nome, cpf_cnpj, endereco, cidade, estado FROM cliente WHERE id = ?";
            try (Connection conn = ConnectionDB.connect();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    return new Cliente(
                            rs.getString("nome"),
                            new Documento(rs.getString("cpf_cnpj")),
                            rs.getString("endereco"),
                            rs.getString("cidade"),
                            rs.getString("estado")
                    );
                }
                throw new RuntimeException("Cliente não encontrado: " + id);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

