package br.com.stangherlin.aplicacao.matricular;

import br.com.stangherlin.dominio.aluno.Aluno;
import br.com.stangherlin.dominio.aluno.CPF;
import br.com.stangherlin.dominio.aluno.Email;

public class MatricularAlunoDTO {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(
                new CPF(cpfAluno),
                nomeAluno,
                new Email(emailAluno)
        );
    }
}
