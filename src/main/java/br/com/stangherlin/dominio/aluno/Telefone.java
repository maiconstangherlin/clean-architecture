package br.com.stangherlin.dominio.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Numero são obrigatórios");
        }
        if (!ehDddValido(ddd)) {
            throw new IllegalArgumentException("DDD invalido!");
        }
        if (!ehNumeroValido(numero)) {
            throw new IllegalArgumentException("Numero invalido!");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    private boolean ehDddValido(String ddd) {
        return ddd.matches("\\d{2}");
    }

    private boolean ehNumeroValido(String ddd) {
        return ddd.matches("\\d{8}|\\d{9}");
    }

}
