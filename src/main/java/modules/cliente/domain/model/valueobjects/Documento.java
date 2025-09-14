package modules.cliente.domain.model.valueobjects;

public class Documento {

    private final String cpf_cnpj;

    public Documento(String cpf_cnpj) {
        String valorLimpo = cpf_cnpj.replaceAll("\\D", "");

        if (!validaCnpj(valorLimpo) && !validaCpf(valorLimpo)) {
            throw new IllegalArgumentException("Cpf ou Cnpj Inválido! Tente Novamente.");
        }

        this.cpf_cnpj = valorLimpo;
    }

    private boolean validaCpf(String valor) {
        return valor.length() == 11; // validação simples
    }

    private boolean validaCnpj(String valor) {
        return valor.length() == 14; // validação simples
    }

    public String getValor() {
        return cpf_cnpj;
    }
}
