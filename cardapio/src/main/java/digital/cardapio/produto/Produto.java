package digital.cardapio.produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Produto")
@Table(name = "produtos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String produto;
	private String descricao;
	private double valor;
	private boolean ativo;
	
	public Produto(ProdutoDtoCadastro dados) {
		this.produto = dados.produto();
		this.descricao = dados.descricao();
		this.valor = dados.valor();
		this.ativo = true;
	}

}
