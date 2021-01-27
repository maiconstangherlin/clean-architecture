package br.com.stangherlin.academico.aplicacao.indicacao;

import br.com.stangherlin.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
