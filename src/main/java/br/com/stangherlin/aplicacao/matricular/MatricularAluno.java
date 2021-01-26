package br.com.stangherlin.aplicacao.matricular;

import br.com.stangherlin.dominio.PublicadorDeEventos;
import br.com.stangherlin.dominio.aluno.Aluno;
import br.com.stangherlin.dominio.aluno.AlunoMatriculado;
import br.com.stangherlin.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void matricular(MatricularAlunoDTO dados) {
        Aluno novoAluno = dados.criarAluno();
        repositorio.matricular(novoAluno);

        AlunoMatriculado evento = new AlunoMatriculado(novoAluno.getCpf());
        publicador.publicar(evento);
    }

}
