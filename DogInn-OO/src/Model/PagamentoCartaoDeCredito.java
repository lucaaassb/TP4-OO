package Model;

import Model.Pagamento;

/**
 * Classe de Pagamento Via Cartão de Crédito, contendo os metodos desta classe e servindo para
 * armazenar os dados no ArrayList
 *
 * @author Lucas Soares
 * @version 1.0 (Abril 2022)
 */

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

	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void setTitularCartao(String titularCartao) {
		this.titularCartao = titularCartao;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
}
