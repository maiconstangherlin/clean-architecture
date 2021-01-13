package br.com.stangherlin.dominio.aluno;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if (isCpfValido(numero))
            throw new IllegalArgumentException("CPF inválido");

        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    private boolean isCpfValido(String cpf){
        return cpf != null &&
                cpf.matches("/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/");
    }

}
