package modules.motorista.infra.persistence.dao;

import modules.cliente.domain.model.Cliente;
import modules.cliente.domain.model.valueobjects.Documento;
import modules.motorista.Motorista;

import java.sql.*;

public class MotoristaDAOImpl implements MotoristaDAO {

    @Override
    public void cadastrarMotorista(Motorista motorista) {

        String query = """
        INSERT INTO motorista (nome, cnh, veiculo, cidade_base)
        VALUES (?, ?, ?, ?)
        """;

        try (Connection conn = modules.cliente.infra.conexao.ConnectionDB.connect();
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getCnh());
            stmt.setString(3, motorista.getVeiculo());
            stmt.setString(4, motorista.getCidadeBase());

            int affected = stmt.executeUpdate();
            if (affected == 0) {
                throw new RuntimeException("Falha ao cadastrar cliente, nenhuma linha afetada.");
            }

            // pega o id gerado
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int idGerado = rs.getInt(1);
                    motorista.setId(idGerado);
                    System.out.println("Motorista salvo com ID: " + idGerado);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao salvar motorista no banco", e);
        }
    }

    @Override
    public Motorista buscarPorId(int id) {
        String sql = "SELECT id, nome, cnh, veiculo, cidadeBase FROM motorista WHERE id = ?";
        try (Connection conn = modules.cliente.infra.conexao.ConnectionDB.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Motorista motorista = new Motorista(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("cnh"),
                        rs.getString("endereco"),
                        rs.getString("cidade"),
                        rs.getString("estado")
                );
                return motorista;
            }
            throw new RuntimeException("Cliente não encontrado: " + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }

    @Override
    public void excluirMotorista(int id) {

    }
}
