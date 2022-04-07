package Model;

/**
 * Classe de Pagamento, que será herdada por PagamentoPIX e PagamentoCartaoDeCredito
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

public abstract class Pagamento {
		
	private float valorServico;
	
	Pagamento(float valorServico) {
		this.valorServico = valorServico;
	}
	
	Pagamento() {
		
	}
	
	public void inserirValor(float valorServico) {
		this.valorServico = valorServico;
	}

	public float getValorServico() {
		return valorServico;
	}

	public void setValorServico(float valorServico) {
		this.valorServico = valorServico;
	}


}