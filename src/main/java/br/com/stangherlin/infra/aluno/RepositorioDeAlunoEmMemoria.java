package br.com.stangherlin.infra.aluno;

import br.com.stangherlin.dominio.aluno.Aluno;
import br.com.stangherlin.dominio.aluno.CPF;
import br.com.stangherlin.dominio.aluno.RepositorioDeAlunos;

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
                .filter(a -> a.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return matriculados;
    }

}
