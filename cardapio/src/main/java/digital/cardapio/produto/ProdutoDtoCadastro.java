package digital.cardapio.produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDtoCadastro(
        @NotBlank
        String produto,
        @NotBlank
        String descricao,
        @NotNull
        double valor) {

    
}
