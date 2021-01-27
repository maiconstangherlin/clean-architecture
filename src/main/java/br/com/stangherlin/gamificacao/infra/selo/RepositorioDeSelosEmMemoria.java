package br.com.stangherlin.gamificacao.infra.selo;

import br.com.stangherlin.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.stangherlin.gamificacao.dominio.selo.Selo;
import br.com.stangherlin.shared.dominio.CPF;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return selos.stream()
                .filter(s -> s.getCpfAluno().equals(cpf))
                .collect(Collectors.toList());
    }

}
