package br.com.stangherlin.gamificacao.dominio.selo;

import br.com.stangherlin.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);

    List<Selo> selosDoAlunoDeCPF(CPF cpf);

}
