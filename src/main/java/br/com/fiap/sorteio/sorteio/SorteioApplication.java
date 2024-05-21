package br.com.fiap.sorteio.sorteio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@Controller
@OpenAPIDefinition(
		info = @Info(
				title = "API de Sorteio - CP 3",
				version = "1.0",
				description = "API para sorteio de números, para a avaliacão do CP 3 da disciplina de Java Advanced da FIAP.",
				contact = @Contact(name = "Leonardo Seiti e Kelvin Gomes ", email = "Leonardoseiti1@gmail.com")
		)

)
public class SorteioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SorteioApplication.class, args);
	}
	public String home() {
		return "Bem vindo ao projeto sorteio!, para mais informações acesse a documentação da API em http://localhost:8080/swagger-ui/index.html#/Dados/docs";
	}

}
