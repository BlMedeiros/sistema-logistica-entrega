package modules.motorista.infra.persistence.dao;

import modules.motorista.Motorista;

public interface MotoristaDAO {

    void cadastrarMotorista(Motorista motorista);

    Motorista buscarPorId(int id);

    void excluirMotorista(int id);
}
