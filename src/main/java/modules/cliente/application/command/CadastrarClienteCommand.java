package modules.cliente.application.command;

import modules.cliente.domain.model.valueobjects.Documento;

public record CadastrarClienteCommand(
        String nome,
        Documento cpf_cpnj,
        String endereco,
        String cidade,
        String estado
) { }
