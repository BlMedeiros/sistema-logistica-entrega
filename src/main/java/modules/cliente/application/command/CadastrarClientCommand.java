package modules.cliente.application.command;

import modules.cliente.domain.model.valueobjects.Documento;

public record CadastrarClientCommand(
        String nome,
        Documento cpf_cpnj,
        String endereco,
        String cidade,
        String estado
) { }
