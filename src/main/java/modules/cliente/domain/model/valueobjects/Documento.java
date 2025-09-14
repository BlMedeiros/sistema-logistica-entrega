package modules.cliente.domain.model.valueobjects;

public class Documento {

    private String cpf_cnpj;

    public Documento(String cpf_cnpj) {

        if(!validaCnpj(cpf_cnpj) && !validaCpf(cpf_cnpj)) {
            throw new IllegalArgumentException("Cpf ou Cnpj Inválido! Tente Novamente.");
        }
    }

    private boolean validaCpf(String cpf_cnpj) {
        String valor = cpf_cnpj.replaceAll("//D", ""); // Remove Tudo que Não for Número

        return valor.length() == 11;
    }

    private boolean validaCnpj(String cpf_cnpj) {
        String valor = cpf_cnpj.replaceAll("//D", "");

        return valor.length() == 14;
    }
}
