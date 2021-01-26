package br.com.stangherlin.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach() {
        this.aluno = new Aluno(
                new CPF("123.456.789-00"),
                "Fulano da Silva",
                new Email("fulano@gmail.com")
        );
    }

    @Test
    @DisplayName("Deve permitir adicionar dois telefones")
    void devePermitirAdicionarDoisTelefones() {
        this.aluno.adicionarTelefone("46", "999998888");
        this.aluno.adicionarTelefone("46", "999997777");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    @DisplayName("Não deve permitir adicionar mais que dois telefones")
    void naoDevePermitirAdicionarUmTerceiroTelefone() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("46", "999998888");
            this.aluno.adicionarTelefone("46", "999997777");
            this.aluno.adicionarTelefone("46", "999996666");
        });
    }
}