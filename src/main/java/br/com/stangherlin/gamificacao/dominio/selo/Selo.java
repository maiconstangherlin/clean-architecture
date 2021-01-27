package br.com.stangherlin.gamificacao.dominio.selo;

import br.com.stangherlin.shared.dominio.CPF;

public class Selo {

    private CPF cpfAluno;
    private String nome;

    public Selo(CPF cpfAluno, String nome) {
        this.cpfAluno = cpfAluno;
        this.nome = nome;
    }

    public CPF getCpfAluno() {
        return cpfAluno;
    }

    public String getNome() {
        return nome;
    }
}
