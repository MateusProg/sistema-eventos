package sistema_eventos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class EndpointBase {
	
	@GetMapping("/")
    public String printar() {
        return "Utilize o swagger no link --> "+"( http://localhost:8080/swagger-ui/index.html )"+" para acessar as funcionalidades de persistência!";
    }
	
}
