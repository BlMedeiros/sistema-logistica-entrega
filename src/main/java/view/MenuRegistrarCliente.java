package view;

import core.utils.ConsoleUtils;
import modules.cliente.application.handlers.dtos.ClienteRegistrarRequest;

public class MenuRegistrarCliente {

    private String nome;
    private String cpf_cnpj;
    private String endereco;
    private String cidade;
    private String estado;

    public void exibirMenu() {
        nome = ConsoleUtils.lerTexto("Digite o Nome do Cliente: ");
        cpf_cnpj = ConsoleUtils.lerTexto("Digite o Cpf/Cnpj do Cliente: ");
        endereco = ConsoleUtils.lerTexto("Digite o Nome do Cliente: ");
        cidade = ConsoleUtils.lerTexto("Digite a Cidade do Cliente: ");
        estado = ConsoleUtils.lerTexto("Digite o Estado do Cliente: ");
    }

    public ClienteRegistrarRequest clienteRequest() {
        return new ClienteRegistrarRequest(nome,cpf_cnpj,endereco,cidade,estado);
    }
}
