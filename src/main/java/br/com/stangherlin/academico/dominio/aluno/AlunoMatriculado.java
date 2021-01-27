package br.com.stangherlin.academico.dominio.aluno;

import br.com.stangherlin.shared.dominio.CPF;
import br.com.stangherlin.shared.dominio.eventos.Evento;
import br.com.stangherlin.shared.dominio.eventos.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

public class AlunoMatriculado implements Evento {

    private final CPF cpfAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfAluno) {
        this.cpfAluno = cpfAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return momento;
    }

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", cpfAluno);
    }

    public CPF getCpfAluno() {
        return cpfAluno;
    }
}
