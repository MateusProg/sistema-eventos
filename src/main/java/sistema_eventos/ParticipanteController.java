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
@RequestMapping("/api/participantes")
public class ParticipanteController {
	
	@Autowired
	private ParticipanteRepository participanteRepository;
	
	@GetMapping
	public List<Participante> listarParticipantes(){
		return participanteRepository.findAll();
	}
	
	@PostMapping
	public Participante criarParticipante(@RequestBody Participante participante) {
		return participanteRepository.save(participante);
	}
	
	@DeleteMapping("/{id}")
	public void deletarParticipante(@PathVariable Long id) {
		participanteRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Participante atualizarParticipante(@PathVariable Long id, @RequestBody Participante novoParticipante) {
		Optional<Participante> optionalParticipante = participanteRepository.findById(id);
		if (optionalParticipante.isPresent()) {
			
			Participante participante = optionalParticipante.get();
	        participante.setNome(novoParticipante.getNome());
	        participante.setCpf(novoParticipante.getCpf());
	        participante.setIdade(novoParticipante.getIdade());
	        participante.setEventos(novoParticipante.getEventos());
	        return participanteRepository.save(novoParticipante);
	        
	    }
		return null;
	}

}
