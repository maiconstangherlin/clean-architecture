package escola;

public class Email {

    private String endereco;

    public Email(String endereco) {
        if (!isEmailValido(endereco))
            throw new IllegalArgumentException("Email inválido");

        this.endereco = endereco;
    }

    private boolean isEmailValido(String endereco) {
        return endereco != null &&
                endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-zA-Z]{2,}$");
    }
}