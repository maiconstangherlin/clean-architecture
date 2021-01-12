package br.com.stangherlin.infra.indicacao;

import br.com.stangherlin.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.stangherlin.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //lógica de envio de emails com a lib Java Mail
    }
}
