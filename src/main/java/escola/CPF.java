package escola;

public class CPF {

    private String cpf;

    public CPF(String cpf) {
        if (isCpfValido(cpf))
            throw new IllegalArgumentException("CPF inválido");
    }

    private boolean isCpfValido(String cpf){
        return cpf != null &&
                cpf.matches("/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/");
    }

}
