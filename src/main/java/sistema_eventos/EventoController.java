package sistema_eventos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@GetMapping
	public List<Evento> listarEventos(){
		return eventoRepository.findAll();
	}
	
	@PostMapping
	public Evento criarEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
	
	@DeleteMapping("/{id}")
	public void deletarEvento(@PathVariable Long id) {
		eventoRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Evento atualizarEvento(@PathVariable Long id, @RequestBody Evento novoEvento) {
		Optional<Evento> optionalEvento = eventoRepository.findById(id);
		if (optionalEvento.isPresent()) {
			
			Evento evento = optionalEvento.get();
	        evento.setNome(novoEvento.getNome());
	        evento.setData(novoEvento.getData());
	        evento.setLocal(novoEvento.getLocal());
	        evento.setParticipantes(novoEvento.getParticipantes());
	        return eventoRepository.save(novoEvento);
	        
	    }
		return null;
	}

}
