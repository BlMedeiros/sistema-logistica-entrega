package modules.cliente.application.handlers.dtos;

public record ClienteRegistrarRequest(String nome, String cpf_cnpj, String endereco, String cidade, String Estado) { }
