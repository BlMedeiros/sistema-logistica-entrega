package modules.cliente.domain.commands;

public record RegistrarClienteCommand(
    String nome,
    String cpfCnpj,
    String endereco,
    String cidade,
    String estado
) {}
