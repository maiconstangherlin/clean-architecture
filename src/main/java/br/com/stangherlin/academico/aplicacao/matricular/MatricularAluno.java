package br.com.stangherlin.academico.aplicacao.matricular;

import br.com.stangherlin.academico.dominio.aluno.Aluno;
import br.com.stangherlin.academico.dominio.aluno.AlunoMatriculado;
import br.com.stangherlin.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.stangherlin.shared.dominio.eventos.PublicadorDeEventos;

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
