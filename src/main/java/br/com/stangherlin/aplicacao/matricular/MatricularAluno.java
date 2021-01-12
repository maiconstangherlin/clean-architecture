package br.com.stangherlin.aplicacao.matricular;

import br.com.stangherlin.dominio.aluno.Aluno;
import br.com.stangherlin.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void Matricular(MatricularAlunoDTO dados) {
        Aluno novoAluno = dados.criarAluno();
        repositorio.matricular(novoAluno);
    }

}
