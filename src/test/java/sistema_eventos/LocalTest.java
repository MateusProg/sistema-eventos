package sistema_eventos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class LocalTest {

    @Test
    void deveCriarEConfigurarLocalCorretamente() {
        // 1. Preparação (Arrange)
        Local local = new Local();

        // 2. Ação (Act)
        local.setId(10L);
        local.setNome("Auditório Principal");
        local.setEndereco("Av. Paulista, 1000 - São Paulo, SP");
        local.setTamanho("Grande (500 pessoas)");

        // 3. Verificação (Assert)
        assertEquals(10L, local.getId());
        assertEquals("Auditório Principal", local.getNome());
        assertEquals("Av. Paulista, 1000 - São Paulo, SP", local.getEndereco());
        assertEquals("Grande (500 pessoas)", local.getTamanho());
    }

    @Test
    void deveIniciarComAtributosNulosPorPadrao() {
        Local local = new Local();

        assertNull(local.getId());
        assertNull(local.getNome());
        assertNull(local.getEndereco());
        assertNull(local.getTamanho());
    }

    @Test
    void devePermitirAtualizarDadosDoLocal() {
        Local local = new Local();
        local.setNome("Sala 101");
        local.setTamanho("Pequeno");

        // Atualizando valores
        local.setNome("Sala 102 - Reformada");
        local.setTamanho("Médio");

        assertEquals("Sala 102 - Reformada", local.getNome());
        assertEquals("Médio", local.getTamanho());
    }

    @Test
    void deveAssociarLocalAoEventoCorretamente() {
        Local local = new Local();
        local.setId(5L);
        local.setNome("Centro de Convenções");
        local.setEndereco("Rua das Flores, 250");
        local.setTamanho("1000 m²");

        Evento evento = new Evento();
        evento.setNome("Conferência Tech");
        evento.setLocal(local);

        assertEquals("Centro de Convenções", evento.getLocal().getNome());
        assertEquals("Rua das Flores, 250", evento.getLocal().getEndereco());
    }
}