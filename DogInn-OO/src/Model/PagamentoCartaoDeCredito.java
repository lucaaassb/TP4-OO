package Model;

import Model.Pagamento;

public class PagamentoCartaoDeCredito extends Pagamento{
	private String bandeiraCartao, numeroCartao, dataValidade, titularCartao, codigoSeguranca;
	
	PagamentoCartaoDeCredito(float valorServico, String bandeiraCartao, String titularCartao, String numeroCartao, String dataValidade, String codigoSeguranca) {
		super(valorServico);
		this.bandeiraCartao = bandeiraCartao;
		this.titularCartao = titularCartao;
		this.numeroCartao = numeroCartao;
		this.dataValidade = dataValidade;
		this.codigoSeguranca = codigoSeguranca;
	}

	public PagamentoCartaoDeCredito () {
		super();
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}
}
