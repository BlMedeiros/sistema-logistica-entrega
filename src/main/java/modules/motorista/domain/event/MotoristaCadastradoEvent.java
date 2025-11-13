package modules.motorista.domain.event;

import core.events.Event;

public class MotoristaCadastradoEvent extends Event {

    private final String nome;
    private final String cnh;
    private final String veiculo;
    private final String cidadeBase;

    public MotoristaCadastradoEvent(int aggregateId,
                                    String nome,
                                    String cnh,
                                    String veiculo,
                                    String cidadeBase) {
        super(aggregateId);
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo = veiculo;
        this.cidadeBase = cidadeBase;
    }

    @Override
    public String getAggregateType() { return "Motorista"; }

    @Override
    public String getEventType() { return "MotoristaCadastrado"; }

    @Override
    public String toJson() {
        return "{"
                + "\"nome\":\"" + nome + "\","
                + "\"cnh\":\"" + cnh + "\","
                + "\"veiculo\":\"" + veiculo + "\","
                + "\"cidadeBase\":\"" + cidadeBase + "\""
                + "}";
    }
}
