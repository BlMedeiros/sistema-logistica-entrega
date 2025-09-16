package modules.cliente.domain.event;

import core.events.Event;
import modules.cliente.domain.model.valueobjects.Documento;

public class ClienteCadastradoEvent extends Event {

    private final String nome;
    private final Documento cpfCnpj;
    private final String endereco;
    private final String cidade;
    private final String estado;

    public ClienteCadastradoEvent(int aggregateId,
                                  String nome,
                                  Documento cpfCnpj,
                                  String endereco,
                                  String cidade,
                                  String estado) {
        super(aggregateId);
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String getAggregateType() {
        return "Cliente";
    }

    @Override
    public String getEventType() {
        return "ClienteCadastrado";
    }

    @Override
    public String toJson() {
        return "{"
                + "\"nome\":\"" + nome + "\","
                + "\"cpf_cnpj\":\"" + cpfCnpj.getValor() + "\","
                + "\"endereco\":\"" + endereco + "\","
                + "\"cidade\":\"" + cidade + "\","
                + "\"estado\":\"" + estado + "\""
                + "}";
    }

    public String getNome() { return nome; }
    public Documento getCpfCnpj() { return cpfCnpj; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getEstado() { return estado; }
}
