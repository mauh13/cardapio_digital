package digital.cardapio.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	
	@Autowired 
	private ProdutoRepository repository;
	
	@PostMapping
	public void cadastrar (@RequestBody ProdutoDtoCadastro dados) {
		repository.save(new Produto(dados));
	}
	
	

}
