package modules.cliente.domain.event;

import core.events.Event;
import modules.cliente.domain.model.valueobjects.Documento;

import java.time.LocalDateTime;

public class ClienteCadastradoEvent extends Event {
    private final int AgreggateId;
    private final String nome;
    private final Documento cpf_cnpj;
    private final String endereco;
    private final String cidade;
    private final String estado;

    public ClienteCadastradoEvent(int agreggateId, String nome, Documento cpf_cnpj, String endereco, String cidade, String estado) {
        super(agreggateId);
        AgreggateId = agreggateId;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
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
        return "Cliente Cadastrado";
    }

    @Override
    public String toJson() {
        return "{"
                + "\"nome\": \"" + nome + "\", "
                + "\"cpf_cnpj\": \"" + cpf_cnpj.getValor() + "\", "
                + "\"endereco\": \"" + endereco + "\", "
                + "\"cidade\": \"" + cidade + "\", "
                + "\"estado\": \"" + estado + "\""
                + "}";    }

    public int getAgreggateId() {
        return AgreggateId;
    }

    public String getNome() {
        return nome;
    }

    public Documento getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

}
