package modules.motorista.application.command;

public record CadastrarMotoristaCommand(
        String nome,
        String cnh,
        String veiculo,
        String cidadeBase
) { }
