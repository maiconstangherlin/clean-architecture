package br.com.stangherlin.academico.infra.aluno;

import br.com.stangherlin.academico.dominio.aluno.Aluno;
import br.com.stangherlin.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.stangherlin.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunoEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return matriculados.stream()
                .filter(a -> a.getCpf().getNumero().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return matriculados;
    }

}
