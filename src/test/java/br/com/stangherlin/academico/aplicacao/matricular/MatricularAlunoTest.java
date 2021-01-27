package br.com.stangherlin.academico.aplicacao.matricular;

import br.com.stangherlin.academico.dominio.aluno.Aluno;
import br.com.stangherlin.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.stangherlin.academico.infra.aluno.RepositorioDeAlunoEmMemoria;
import br.com.stangherlin.shared.dominio.CPF;
import br.com.stangherlin.shared.dominio.eventos.PublicadorDeEventos;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

    private static PublicadorDeEventos publicador;

    @BeforeAll
    static void beforeAll() {
        publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());
    }

    @Test
    @DisplayName("Aluno deve ser persistido")
    void alunoDeveSerPersistido() {
        RepositorioDeAlunoEmMemoria repositorio = new RepositorioDeAlunoEmMemoria();
        MatricularAluno matricularAluno = new MatricularAluno(repositorio, publicador);

        MatricularAlunoDTO dados = new MatricularAlunoDTO("Fulano", "000.111.222-33", "fulano@email.com");
        matricularAluno.matricular(dados);

        Aluno alunoEncontrado = repositorio.buscarPorCPF(new CPF("000.111.222-33"));

        assertEquals("Fulano", alunoEncontrado.getNome());
        assertEquals("000.111.222-33", alunoEncontrado.getCpf().getNumero());
        assertEquals("fulano@email.com", alunoEncontrado.getEmail());

    }

}