package br.com.stangherlin.academico.dominio.aluno;

import br.com.stangherlin.shared.dominio.eventos.Evento;
import br.com.stangherlin.shared.dominio.eventos.Ouvinte;

import java.time.format.DateTimeFormatter;

public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    public void reageAo(Evento evento) {
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(
                String.format("Aluno com CPF %s foi matriculado em: %s",((AlunoMatriculado) evento).getCpfAluno(), momentoFormatado)
        );
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
