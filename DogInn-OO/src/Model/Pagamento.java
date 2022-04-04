package Model;

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

}