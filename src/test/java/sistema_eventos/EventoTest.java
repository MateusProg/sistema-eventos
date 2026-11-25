package sistema_eventos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EventoTest {

    @Test
    void deveCriarEConfigurarEventoCorretamente() {
        // 1. Preparação (Arrange)
        Evento evento = new Evento();
        Local local = new Local();
        Participante participante = new Participante();

        // 2. Ação (Act)
        evento.setId(1L);
        evento.setNome("Workshop de Java e CI/CD");
        evento.setData("2026-11-25");
        evento.setLocal(local);
        evento.getParticipantes().add(participante);

        // 3. Verificação (Assert)
        assertEquals(1L, evento.getId());
        assertEquals("Workshop de Java e CI/CD", evento.getNome());
        assertEquals("2026-11-25", evento.getData());
        assertNotNull(evento.getLocal());
        assertEquals(1, evento.getParticipantes().size());
        assertTrue(evento.getParticipantes().contains(participante));
    }

    @Test
    void deveIniciarComListaDeParticipantesVazia() {
        Evento evento = new Evento();

        assertNotNull(evento.getParticipantes());
        assertTrue(evento.getParticipantes().isEmpty());
    }
}