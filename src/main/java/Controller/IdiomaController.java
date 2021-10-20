package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.Saludo;

@RestController
public class IdiomaController {

	@Autowired Saludo saludo;
	
	@GetMapping("/saludos")
	public String getSaludos(){
		System.out.println(saludo.mensajeSaludo());
		return saludo.getIdioma();
	}
}
