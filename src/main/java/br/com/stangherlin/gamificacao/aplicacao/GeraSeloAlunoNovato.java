package br.com.stangherlin.gamificacao.aplicacao;

import br.com.stangherlin.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.stangherlin.gamificacao.dominio.selo.Selo;
import br.com.stangherlin.shared.dominio.CPF;
import br.com.stangherlin.shared.dominio.eventos.Evento;
import br.com.stangherlin.shared.dominio.eventos.Ouvinte;
import br.com.stangherlin.shared.dominio.eventos.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "Novato");

        repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }

}
