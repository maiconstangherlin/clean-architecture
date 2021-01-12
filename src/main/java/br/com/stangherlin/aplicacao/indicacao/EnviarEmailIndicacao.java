package br.com.stangherlin.aplicacao.indicacao;

import br.com.stangherlin.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
