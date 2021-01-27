package br.com.stangherlin.academico.infra.indicacao;

import br.com.stangherlin.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.stangherlin.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //lógica de envio de emails com a lib Java Mail
    }
}
