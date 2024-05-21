package br.com.fiap.sorteio.sorteio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/sorteio")
@Tag(name = "Dados", description = "Essa classe tem 2 enpoints, um para retornar um número aleatório entre 1 e 6 e outro para retornar um número aleatório entre 1 e o valor definido pelo usuário.")
public class SorteioController {


    @GetMapping("/dado")
    @Operation(summary = "Sorteio de um número aleatório entre 1 e 6")
    @ApiResponse(responseCode = "200", description = "Número  de 1 a 6 sorteado com sucesso, o número sorteado foi: ")
    public int sorteio() {
        return (int) (Math.random() * 6 + 1);
    }

    @GetMapping("/dado/{max}")
    @Operation(summary = "Sorteio de um número aleatório entre 1 e o valor definido pelo usuário")
    @ApiResponse(responseCode = "200", description = "Número sorteado foi: ")
    public int sorteio(@PathVariable int max) {
        return (int) (Math.random() * max + 1);
    }
}
