package modules.motorista.application.handlers;

import infra.eventstore.EventStore;
import modules.motorista.Motorista;
import modules.motorista.application.command.CadastrarMotoristaCommand;
import modules.motorista.domain.event.MotoristaCadastradoEvent;
import modules.motorista.infra.persistence.dao.MotoristaDAO;
import modules.motorista.infra.persistence.dao.MotoristaDAOImpl;

public class CadastrarMotoristaHandler {

    public void handle(CadastrarMotoristaCommand cmd) {

        var motorista = new Motorista(cmd.nome(),cmd.cnh(),cmd.veiculo(), cmd.cidadeBase());

        MotoristaDAO dao = new MotoristaDAOImpl();

        dao.cadastrarMotorista(motorista);

        MotoristaCadastradoEvent event = new MotoristaCadastradoEvent(motorista.getId(), motorista.getNome(), motorista.getCnh(), motorista.getVeiculo(), motorista.getCidadeBase());

        EventStore.append(event);
    }
}
