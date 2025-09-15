package modules.cliente.domain.event;

import modules.cliente.domain.model.valueobjects.Documento;

import java.time.LocalDateTime;

public class ClienteCadastradoEvent {
    private final int AgreggateId;
    private final String nome;
    private final Documento cpf_cnpj;
    private final String endereco;
    private final String cidade;
    private final String estado;
    private final LocalDateTime created_at;

    public ClienteCadastradoEvent(int agreggateId, String nome, Documento cpf_cnpj, String endereco, String cidade, String estado, LocalDateTime created_at) {
        AgreggateId = agreggateId;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.created_at = created_at;
    }

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

    public LocalDateTime getCreated_at() {
        return created_at;
    }
}
