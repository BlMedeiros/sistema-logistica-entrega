package modules.cliente.domain.event;

import core.events.Event;
import modules.cliente.domain.model.valueobjects.Documento;

public class ClienteExcluidoEvent extends Event {

    private final String nome;
    private final Documento cpfCnpj;

    public ClienteExcluidoEvent(int aggregateId, String nome, Documento cpfCnpj) {
        super(aggregateId);
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public String getAggregateType(){
        return "Cliente";
    }

    @Override
    public String getEventType() {
        return "ClienteExcluido";
    }

    @Override
    public String toJson() {
        return "{"
                + "\"nome\":\"" + nome + "\","
                + "\"cpf_cnpj\":\"" + cpfCnpj.getValor() + "\","
                + "}";
    }


}
