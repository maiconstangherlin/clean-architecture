package br.com.stangherlin.dominio.aluno;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TelefoneTest {

    @Test
    @DisplayName("Não deve criar telefone inválido")
    void naoDeveCriarTelefoneInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("1", "12345678"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("46", "1234567"));
    }

    @Test
    @DisplayName("Deve criar telefone quando os dados sao validos")
    void deveCriarTelefoneQuandoDadosSaoValidos() {
        Telefone telefone = new Telefone("46", "999991234");

        assertEquals("46", telefone.getDdd());
        assertEquals("999991234", telefone.getNumero());
    }

}